package com.company;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;


public class Test2Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void test2() {
    driver.get("https://www.mortgagecalculator.org/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    {
      WebElement element = driver.findElement(By.id("homeval"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("homeval"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("homeval"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.id("homeval")).click();
    driver.findElement(By.id("homeval")).click();
    {
      WebElement element = driver.findElement(By.id("homeval"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("homeval"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("homeval"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.id("homeval")).click();
    driver.findElement(By.id("homeval")).sendKeys("300000");
    driver.findElement(By.id("downpayment")).click();
    driver.findElement(By.id("homeval")).click();
    driver.findElement(By.id("loanamt")).click();
    driver.findElement(By.id("loanamt")).click();
    driver.findElement(By.id("loanamt")).sendKeys("13000.00");
    driver.findElement(By.id("intrstsrate")).click();
    driver.findElement(By.id("intrstsrate")).sendKeys("2");
    driver.findElement(By.name("cal")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("a:nth-child(5) > img"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("a:nth-child(5) > img"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".rw-box:nth-child(1) > .left-cell > h3")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("a:nth-child(5) > img"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("a:nth-child(5) > img"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".rw-box:nth-child(1) > .left-cell > h3")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("a:nth-child(5) > img"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".rw-box:nth-child(1) > .left-cell > h3")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".rw-box:nth-child(1) > .left-cell > h3"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.id("homeval")).click();
    driver.findElement(By.id("homeval")).sendKeys("50000");
    driver.findElement(By.id("downpayment")).click();
    driver.findElement(By.id("downpayment")).sendKeys("6000");
    driver.findElement(By.id("intrstsrate")).click();
    driver.findElement(By.id("intrstsrate")).sendKeys("2");
    driver.findElement(By.name("cal")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("a:nth-child(5) > img"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".calcu-block > .rw-box:nth-child(1) > .left-cell"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".calcu-block > .rw-box:nth-child(1) > .left-cell"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".calcu-block > .rw-box:nth-child(1) > .left-cell"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".calcu-block > .rw-box:nth-child(1)")).click();
    driver.findElement(By.id("homeval")).sendKeys("1000");
    driver.findElement(By.id("downpayment")).click();
    driver.findElement(By.id("downpayment")).sendKeys("5000");
    driver.findElement(By.id("intrstsrate")).click();
    driver.findElement(By.id("intrstsrate")).sendKeys("2");
    driver.findElement(By.id("pptytax")).click();
    driver.findElement(By.id("pptytax")).sendKeys("2400");
    driver.findElement(By.name("cal")).click();
    js.executeScript("window.scrollTo(0,211.1999969482422)");
    driver.findElement(By.cssSelector(".rw-box:nth-child(1) > .left-cell > h3")).click();
    driver.findElement(By.cssSelector(".rw-box:nth-child(1) > .left-cell > h3")).click();
    driver.findElement(By.cssSelector(".rw-box:nth-child(1) > .left-cell > h3")).click();
    assertThat(driver.findElement(By.cssSelector(".rw-box:nth-child(1) > .left-cell > h3")).getText(), is("$287.45"));
    driver.findElement(By.cssSelector(".calcu-block > .rw-box:nth-child(1)")).click();
    driver.findElement(By.id("hoi")).click();
    driver.findElement(By.id("downpayment")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".calcu-block > .rw-box:nth-child(2) > .left-cell"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".calcu-block > .rw-box:nth-child(2) > .left-cell"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".calcu-block > .rw-box:nth-child(2) > .left-cell"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".calcu-block > .rw-box:nth-child(2)")).click();
    driver.findElement(By.id("downpayment")).sendKeys("5000");
    {
      WebElement element = driver.findElement(By.cssSelector(".calcu-block > .rw-box:nth-child(1)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".calcu-block > .rw-box:nth-child(1)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".calcu-block > .rw-box:nth-child(1)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".calcu-block > .rw-box:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".rw-box:nth-child(1) > .left-cell > h3")).click();
    assertThat(driver.findElement(By.cssSelector(".rw-box:nth-child(1) > .left-cell > h3")).getText(), is("$287.45"));
    driver.get("https://www.mortgagecalculator.org/");
    vars.put("test", driver.findElement(By.cssSelector(".rw-box:nth-child(1) > .left-cell > h3")).getText());
    System.out.println(vars.get("test").toString());
  }
}