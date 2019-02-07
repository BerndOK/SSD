package abstractfactory.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
	public static Properties readProp(String fileName) {

		Properties prop = new Properties();
		InputStream input = null;

		try {
			input = new FileInputStream(fileName);
			prop.load(input);
			return prop;
		} catch (IOException ex) {
			return null;
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					return null;
				}
			}
		}
	}
}
