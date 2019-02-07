package abstractfactory.factory;

import java.util.Properties;

public class AbstractFactory {
	public static GUIFactory getFactory() {
		Properties prop = PropertyReader.readProp("config/config.properties");
		String os = prop.getProperty("os").toUpperCase();
		
		if (os.equals("OS1")) {
			return new OS1GUIFactory();
		} else if (os.equals("OS2")) {
			return new OS2GUIFactory();
		} else {
			throw new IllegalStateException();
		}
	}
}
