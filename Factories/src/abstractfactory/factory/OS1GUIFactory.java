package abstractfactory.factory;

import abstractfactory.classes.Button;
import abstractfactory.classes.Menu;
import abstractfactory.classes.os1.OS1Button;
import abstractfactory.classes.os1.OS1Menu;

public class OS1GUIFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new OS1Button();
	}

	@Override
	public Menu createMenu() {
		return new OS1Menu();
	}

}
