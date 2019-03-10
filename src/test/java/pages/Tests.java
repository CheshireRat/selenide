package pages;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public  class Tests {
    @Test
    public void wikiSearch() {
        System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");
        WebDriver driver = new ChromeDriver ();
        WebDriverRunner.setWebDriver (driver);
        System.setProperty("selenide.browser", "Chrome");
        open("https://en.wikipedia.org/wiki/Main_Page");
        $(By.id ("searchInput")).val("Demo").pressEnter();
        $(By.id ("n-mainpage-description")).click();
        $(By.xpath ("//*[@id=\"mw-content-text\"]/div/ul[2]/li[1]/a")).click();
        $(By.id ("bodyContent")).shouldHave(text("The demoscene is an international"));
    }

    }

