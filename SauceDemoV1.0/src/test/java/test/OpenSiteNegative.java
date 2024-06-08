package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenSiteNegative {
    public static void main(String[] args) throws InterruptedException {
        //initialize Chrome Driver
        WebDriver driver =new ChromeDriver();
        //Maximize Chrome Driver
        driver.manage().window().maximize();
        //open site
        driver.get("https://www.saucedemo.com/");
        //insert username and password
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //login into products page
        driver.findElement(By.id("login-button")).click();
        //wait
        Thread.sleep(3000);



        //Go to Cart Page
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(2000); //Wait
        driver.findElement(By.id("checkout")).click();

        //Checkout: Your Information Page
        driver.findElement(By.id("first-name")).sendKeys("Ahmed");
        driver.findElement(By.id("last-name")).sendKeys("Elkholy");
        driver.findElement(By.id("postal-code")).sendKeys("112233");
        driver.findElement(By.id("continue")).click();

        //Finish the Order
        driver.findElement(By.id("finish")).click();
        Thread.sleep(2000); //Wait

        //Close Browser
        driver.close();








    }
}
