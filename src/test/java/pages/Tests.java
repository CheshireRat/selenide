package pages;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class Tests {
    WebDriver driver;
    WikiPages wikipages;

    @Test
    public void wikiSearch() {
        String url = "https://en.wikipedia.org/wiki/Main_Page";
        System.setProperty ("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");
        WebDriver driver = new ChromeDriver ( );
        WebDriverRunner.setWebDriver (driver);
        System.setProperty ("selenide.browser", "Chrome");
        wikipages.navigate (url);
        wikipages.searchInput ("Demo");
        //$(By.id ("searchInput")).val("Demo").pressEnter();
        $ (By.id ("searchButton")).click ( );
        $ (By.xpath ("//*[@id='mw-content-text']/div/ul[*]/li[*][contains(text(),'Demo')]")).click ( );
        $ (By.id ("bodyContent")).shouldHave (text ("The demoscene is an international"));
    }

}

