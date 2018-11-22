
public class Main {

	public static void main(String[] args) {
		AbstractFactory pf = FactoryMaker.getFactory("a");
		AbstractProductA product = pf.createProductA();
	}
}
