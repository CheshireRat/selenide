package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class WikiPages {
    WebDriver driver;
    void navigate(String url) {
        driver.navigate ( ).to (url);
    }
    WikiPages(WebDriver driver) {
        this.driver = driver;
    }

    void searchInput(String input) {
        driver.findElement (By.id ("searchInput")).sendKeys (input);
        driver.findElement (By.id ("searchInput")).submit ();
    }


    //$(By.id ("searchInput")).val("Demo").pressEnter();
    //$(By.id ("n-mainpage-description")).click();
    //$(By.xpath ("//*[@id='mw-content-text']/div/ul[2]/li[1]/a")).click();
    //$(By.id ("bodyContent")).shouldHave(text("The demoscene is an international"));

}
