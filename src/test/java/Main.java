import com.sun.corba.se.impl.encoding.CDRInputObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        login();
        AddToWishList();
        AddToCart();
        NewsLetter();
        Search();
        CheckOut();
        ChangeLanguage();
    }
    public static void login(){
     WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("cosmin@fasttrackit.org");
        driver.findElement(By.cssSelector("#pass")).sendKeys("123456");
        driver.findElement(By.cssSelector("#send2")).click();
        driver.close();
    }
    public static void AddToWishList(){
        WebDriver driver= new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > div.actions > a")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();
        driver.close();

    }
    public static void AddToCart(){
        WebDriver driver=new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.std > div.widget.widget-new-products > div.widget-products > ul > li:nth-child(2) > a > img")).click();
        driver.findElement(By.cssSelector("#swatch22 > span.swatch-label > img")).click();
        driver.findElement(By.cssSelector("#swatch80 > span.swatch-label")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button > span > span")).click();
        driver.close();

    }
    public static void NewsLetter(){
        WebDriver driver= new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#newsletter")).sendKeys("reberus@yahoo.com");
        driver.findElement(By.cssSelector("#newsletter-validate-detail > div > div.actions > button > span > span")).click();
        driver.close();
    }
    public static void Search(){
        WebDriver driver=new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#search")).sendKeys("jackets");
        driver.findElement(By.cssSelector("#search_mini_form > div.input-box > button")).click();
        driver.close();

    }
    public static void CheckOut(){
        WebDriver driver=new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(4) > a")).click();
        driver.findElement(By.cssSelector("#login-email")).sendKeys("panarebeca21@yahoo.com");
        driver.findElement(By.cssSelector("#login-password")).sendKeys("123456");
        driver.findElement(By.cssSelector("#checkout-step-login > div > div.col-2 > div > button > span > span")).click();
        driver.close();
    }
    public static void ChangeLanguage(){
        WebDriver driver=new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#select-language")).sendKeys("english");
        driver.close();

    }
    }


