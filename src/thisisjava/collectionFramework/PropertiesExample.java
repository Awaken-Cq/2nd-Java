package thisisjava.collectionFramework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws Exception {

		
		Properties properties = new Properties();
		
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		
		path = URLDecoder.decode(path, "UTF-8");
		System.out.println(path);
		properties.load(new FileReader(path));
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String country = properties.getProperty("country");
		String language = properties.getProperty("language");
		
		System.out.println(driver);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		System.out.println(country);
		System.out.println(language);
	}
}
