package de.frameworktsr.utils;

public class GlobalParamenters {
    //created thread local variable for capabilities and don't want to change through the execution

    private static ThreadLocal<String> platformName = new ThreadLocal<>();
    private static ThreadLocal<String> deviceName = new ThreadLocal<>();
    private static ThreadLocal<String> systemPort = new ThreadLocal<>();

    // create setter and getter ethod for created method

    public void setPlatformName(String platform){
        platformName.set(platform);
    }
     
    public String getPlatformName(){
        return platformName.get();
    }

    public void setDeviceName(String device){
        setDeviceName.set(device);
    }
    public String getDeviceName(){
        return deviceName.get();
    }

    public void setSystemPort(String system){
        systemPort.set(systemPort);
    }

    public String getSystemPort(){
        return systemPort.get();
    } 

    //initialize the paramenters
    public void initializeGlobalParams(){
        GlobalParamenters paramenters = new GlobalParamenters();
        paramenters.setPlatformName(System.getProperty("platformName","Android"));
        paramenters.setDeviceName(System.getProperty("deviceName", "Android"));
        paramenters.setSystemPort("200000");
    }
}
