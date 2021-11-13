package com.Selenium_for_intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.setProperty("webdriver.chrome.driver", "E:\\OFFICE\\SELENIUM WebDriver\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.phptravels.net/");
        // driver.quit();
        driver.findElement(By.linkText("Tours")).click();
         // driver.findElement(By.name("Tours")).click();
       // driver.findElement(By.linkText("Search By City")).clear();
       // driver.findElement(By.linkText("Search By City")).sendKeys("Johor Bahru");
       // WebElement searchBar = driver.findElement(By.name("q"));
        //searchBar.sendKeys("Tours");
       // WebElement searchButton = driver.findElement(By.name("btnk"));
        //searchButton.click();
        //driver.findElement(By.id("tours-tab")).click();
        





          }
}
