package st;


import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {
   volatile String br;

    public static final String HTTPS_WWW_ST_BY = "https://www.st.by/";

    @BeforeTest
    @Parameters({"br"})
    public void init(@Optional String br) {
        this.br = br;
        switch (this.br) {
            case "chrome":
                Configuration.browser = "chrome";
                break;
            case "firefox":
                Configuration.browser = "firefox";
                break;
        }

        open(HTTPS_WWW_ST_BY);
    }

}
