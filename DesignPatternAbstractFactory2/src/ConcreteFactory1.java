
public class ConcreteFactory1 extends AbstractFactory{

	@Override
	public AbstractProductA createProductA() {
		return new ProductA1("Product A1");
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB1("Product B1");
	}
}
