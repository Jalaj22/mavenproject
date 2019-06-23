package com.edusol.mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */ 
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.gecko.driver","E:\\JAR\\SeleniumJAR\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        
        
    }
}
