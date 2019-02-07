package abstractfactory.factory;

import abstractfactory.classes.Button;
import abstractfactory.classes.Menu;
import abstractfactory.classes.os2.OS2Button;
import abstractfactory.classes.os2.OS2Menu;

public class OS2GUIFactory implements GUIFactory {
	@Override
	public Button createButton() {
		return new OS2Button();
	}

	@Override
	public Menu createMenu() {
		return new OS2Menu();
	}

}
