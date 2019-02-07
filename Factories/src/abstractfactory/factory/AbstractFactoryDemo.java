package abstractfactory.factory;
import abstractfactory.classes.Button;
import abstractfactory.classes.Menu;

public class AbstractFactoryDemo {
	public static void main(String[] args) {
		GUIFactory gf = AbstractFactory.getFactory();
		Button b = gf.createButton();
		Menu m = gf.createMenu();
		System.out.println(b.getClass());
		System.out.println(m.getClass());
	}
}
