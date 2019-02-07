package abstractfactory.factory;

import abstractfactory.classes.Button;
import abstractfactory.classes.Menu;

public interface GUIFactory {
	Button createButton();
	Menu createMenu();
}
