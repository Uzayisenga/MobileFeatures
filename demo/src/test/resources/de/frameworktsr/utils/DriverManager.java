package de.frameworktsr.utils;

import java.io.IOException;

import org.openqa.selenium.Capabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class DriverManager {
    
    public static ThreadLocal <AppiumDriver> driver =new ThreadLocal<>();
        
    //create   a getter method for the driver

    public AppiumDriver getDriver(){
        return driver.get();
    }


    //Create a setter method for the driver
    public void setDriver(AppiumDriver driverValue){
        driver.set(driverValue);
    }

    //Create a method to initialize the driver
    public void initializeDriver(){
        AppiumDriver driver =null;
        if(driver ==null){
            try{
                //Create a driver instance using appium server URL ans desired Capabilities
            driver =new AndroidDriver(new ServerManager().getUrl(),new CapabilitiesManager().getCapability()) ;
            
            // Set the Threadloacl driver driver variable to equal to the newly created driver
            DriverManager.driver.set(driver);
        }
        catch(IOException e){
            e.printStackTrace();
            throw e;
        }
    }
    }
}
