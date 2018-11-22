
public class ConcreteFactory2 extends AbstractFactory{

	@Override
	public AbstractProductA createProductA() {
		return new ProductA2("Product A2");
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB2("Product B2");
	}

}
