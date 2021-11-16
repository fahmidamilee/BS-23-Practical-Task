package com.Selenium_for_intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FlightBooking {

    public static void main(String[] args) throws InterruptedException{

        // Set Location
        System.setProperty("webdriver.chrome.driver", "E:\\OFFICE\\SELENIUM WebDriver\\chromedriver.exe" );

        // Open Browser
        WebDriver driver = new ChromeDriver();

        //Navigate
        driver.get("https://www.phptravels.net/");

        System.out.println("URL is launched successfully");

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       // driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);

        // Find Element
        driver.findElement(By.id("tours-tab")).click();
        System.out.println(" Tours tab from search bar is clicked");
        Thread.sleep(3000);

        driver.findElement(By.className("select2-search__field")).sendKeys("Johor Bahru");
        Thread.sleep(3000);
        //WebElement destination = driver.findElement(By.id("select2-tours_city-container"));
        //destination.sendKeys("Johor Bahru");
        //driver.findElement(By.id("tours-search")).sendKeys("Johor Bahru");
        //driver.findElement(By.id("select2-tours_city-container")).sendKeys("Johor Bahru");
        //Thread.sleep(3000);
        driver.findElement(By.id("select2-tours_city-results")).click();
        Thread.sleep(3000);

        //WebElement dateBox = driver.findElement(By.name("checkin:"));
        //dateBox.sendKeys("20112021");


        //driver.findElement(By.name("checkin")).click();
        //Thread.sleep(3000);

        driver.findElement(By.className("guest_tours")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("la la-plus")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("guest_tours")).click();
        Thread.sleep(3000);

       // driver.findElement(By.className("ladda-label")).click();

        driver.findElement(By.id("submit")).click();
        Thread.sleep(3000);


        

        //CLoses Browser
        driver.quit();
        





          }
}
