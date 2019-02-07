package abstractfactory.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {

		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream("config/config.properties");

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			System.out.println(prop.getProperty("user"));
			System.out.println(prop.getProperty("browser"));
			System.out.println(prop.getProperty("os"));
			System.out.println(prop.getProperty("version"));

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	  }
}
