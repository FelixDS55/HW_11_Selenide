package qa.guru;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeAll
    static void setUp(){
        open("https://github.com/");
        Configuration.holdBrowserOpen = true;
    }


}
