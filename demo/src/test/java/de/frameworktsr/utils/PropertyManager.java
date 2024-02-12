package de.frameworktsr.utils;

import java.io.IOException;
import java.util.Properties;
import java.io.InputStream;

public class PropertyManager {

    // initializing the the variable of type Properties holding properties.config
    private static Properties props = new Properties();

    public Properties getProperties() throws IOException{
        InputStream inputStream =null;
        String propFileName ="config.properties";

        if(props.isEmpty()){
            try{
                //Fetch properties from config.properties and assign them to inoutStream variable
                inputStream =getClass().getClassLoader().getResourceAsStream(propFileName);

                //Assign the fetched properties to props variable

                props.load(inputStream);
            }
            catch(IOException e){
                e.printStackTrace();
                //print the error and its origin
                throw e;
            }
            finally{
                //Close inputStream is it has been successfully retrieved

                if(inputStream !=null)
                inputStream.close();
            }
        }
        return props;
    }
    
}
