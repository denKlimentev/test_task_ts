package st;


import com.codeborne.selenide.Configuration;
import lombok.SneakyThrows;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.Semaphore;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

public class TestBase {

    private static Semaphore semaphore = new Semaphore(1);

    private static final String HTTPS_WWW_ST_BY = "https://www.st.by/";

    @SneakyThrows
    @BeforeTest
    @Parameters({"br"})
    public void init(@Optional String br) {
        semaphore.acquire(1);
        try {
            if ("chrome".equals(br)) {
                Configuration.browser = "chrome";
            } else {
                Configuration.browser = "firefox";
            }
//            Configuration.remote = "http://localhost:4444/wd/hub";
            open(HTTPS_WWW_ST_BY);
        }finally {
            semaphore.release();
        }
    }

    @AfterTest
    public void destroy() {
        System.out.println("aaaa  " + Thread.currentThread().getName() + " === ");
        closeWebDriver();
    }
}
