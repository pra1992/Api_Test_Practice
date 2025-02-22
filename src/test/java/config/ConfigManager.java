package config;


import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.management.RuntimeErrorException;

public class ConfigManager {
	
	 private static Properties properties = new Properties();
     
	 static {
		 try {
			FileInputStream file = new FileInputStream(new File("./src/test/resources/Utilities/Config.properties"));
			properties.load(file);
		} catch (IOException e) {
			throw new RuntimeErrorException(null, "Failed to load configuration file due to " + e.getMessage());
		}
		 
	 }
	 
	 public static String getProperty(String KeyName) {
		 return properties.getProperty(KeyName);
	 }
	 
	}
	
	


