
    package com.selenium.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

    public class bag {
        static WebDriver driver;
        static WebDriverWait wait;
        String baseUrl = "https://app.germanyiscalling.com";

        @BeforeClass
        public static void setUp() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.get("https://app.germanyiscalling.com/common/login/?next=https%3A%2F%2Fapp.germanyiscalling.com%2Fcv%2Fhome%2F");
        }

     /*   @Test
        public void testSuccessfulLogin() {
            WebElement emailField = driver.findElement(By.id("username"));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

            emailField.sendKeys("isha123@gmail.com");
            passwordField.sendKeys("Admin@123#");
            loginButton.click();
            // driver.getCurrentUrl();
            Assert.assertEquals(driver.getCurrentUrl(), "https://app.germanyiscalling.com/cv/upload/");
            //WebElement profileIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("profileIcon")));
            //assert (profileIcon.isDisplayed());
        }
    }
/*
        @Test
        public void testUnsuccessfulLoginInvalidPassword() {
            WebElement emailField = driver.findElement(By.id("username"));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

            emailField.sendKeys("isha123@gmail.com");
            passwordField.sendKeys("Admin@1");
            loginButton.click();

            WebElement errorMsg = driver.findElement(By.xpath("//li[text()='Please enter a correct username and password. Note that both fields may be case-sensitive.']"));
            String ExpectedText = errorMsg.getText();
            String ActualText = "Please enter a correct username and password. Note that both fields may be case-sensitive.";
            Assert.assertEquals(ExpectedText, ActualText);

            // WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("errorMessage")));
          //  assert (errorMessage.isDisplayed());
        }
    }
*/

      /*  @Test
        public void testUnsuccessfulLoginInvalidEmail() {
            WebElement emailField = driver.findElement(By.id("username"));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

            emailField.sendKeys("isha123gmail.com");
            passwordField.sendKeys("Admin@123#");
            loginButton.click();

            WebElement errorMsg = driver.findElement(By.xpath("//li[text()='Please enter a correct username and password. Note that both fields may be case-sensitive.']"));
            String ExpectedText = errorMsg.getText();
            String ActualText = "Please enter a correct username and password. Note that both fields may be case-sensitive.";
            Assert.assertEquals(ExpectedText, ActualText);
        }
    }
    */

        /*
                @Test
                public void testEmptyFields() {
                    WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
                    loginButton.click();

                    WebElement errorMsg = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
                    String ExpectedText = errorMsg.getText();
                    String ActualText = "Email: This field is required.\n" +
                            "Password: This field is required.";
                    Assert.assertEquals(ExpectedText, ActualText);

                }
            }
        /*
        */
        /*

        @Test
        public void testLoginWithEmptyPassword() {
            WebElement emailField = driver.findElement(By.id("username"));
            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

            emailField.sendKeys("isha123@gmail.com");
            loginButton.click();

            WebElement errorMsg = driver.findElement(By.xpath("//li[normalize-space()='Password: This field is required.']"));
            String ExpectedText = errorMsg.getText();
            String ActualText = "Password: This field is required.";
            Assert.assertEquals(ExpectedText, ActualText);

        }
    }
*/
        @Test
        public void testLoginWithEmptyEmail() {
            WebElement emailField = driver.findElement(By.id("username"));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
            // emailField.sendKeys("");
            passwordField.sendKeys("Admin@123#");
            loginButton.click();
            WebElement errorMsg = driver.findElement(By.xpath("//li[normalize-space()='Email: This field is required.']"));
            String ExpectedText = errorMsg.getText();
            String ActualText = "Email: This field is required.";
            Assert.assertEquals(ExpectedText, ActualText);
        }
    }






