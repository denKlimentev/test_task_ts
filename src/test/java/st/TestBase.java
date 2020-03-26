package st;


import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    public static final String HTTPS_WWW_ST_BY = "https://www.st.by/";

    @BeforeTest
    @Parameters({"br"})
    public  void init(@Optional String br) {
        System.out.println("iii  " + Thread.currentThread().getName() + " === " + br);

        if("chrome".equals(br)){

            Configuration.browser = "chrome";
            System.setProperty("selenide.browser", "chrome");
            System.out.println(1 +  Configuration.browser);

        }else {
            Configuration.browser = "firefox";
            System.setProperty("selenide.browser", "firefox");
            System.out.println(2 +  Configuration.browser);
        }

        System.out.println(Configuration.browser);
        open(HTTPS_WWW_ST_BY);

    }

    @AfterTest
    public void destroy(){
        System.out.println("aaaa  " + Thread.currentThread().getName() + " === ");
        closeWebDriver();
    }
}
