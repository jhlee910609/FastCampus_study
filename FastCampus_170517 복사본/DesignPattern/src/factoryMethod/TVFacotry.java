package factoryMethod;

public class TVFacotry extends FactoryMethod {

	@Override
	public Product make() {
		return new TV();
	}

}
