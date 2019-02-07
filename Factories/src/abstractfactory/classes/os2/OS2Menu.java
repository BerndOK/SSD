package abstractfactory.classes.os2;

import abstractfactory.classes.Menu;

public class OS2Menu implements Menu {
	@Override
	public String getSelection() {
		return "Exit"; // Irrelevant
	}

}
