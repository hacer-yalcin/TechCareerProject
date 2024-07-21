package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.time.Instant;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseTest{

    private org.openqa.selenium.JavascriptExecutor JavascriptExecutor;

    @Step("Accept cookies")
    public void acceptCookies() {
        driver.findElement(By.id("sp-cc-accept")).click();
    }

    @Step("Click the first login button")
    public void clickFirstLogin(){
        driver.findElement(By.xpath("//span[@class='nav-line-2 ']/span[@class='nav-icon nav-arrow']")).click();
    }

    @Step("Check the successful login")
    public void checkSuccessfulLogin(String text) {
        String value = driver.findElement(By.xpath("//span[.='test\u200B']")).getText();
        Assert.assertEquals(value, text);
    }

    @Step("Click the book category")
    public void clickBookCategory() {
        driver.findElement(By.xpath("//a[.='Kitap']")).click();
    }

    @Step("Click the children books category")
    public void clickChildren() {
        driver.findElement(By.xpath("//div[@id='s-refinements']//span[.='Çocuk Kitapları']")).click();
    }

