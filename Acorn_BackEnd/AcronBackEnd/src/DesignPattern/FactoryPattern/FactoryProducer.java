package DesignPattern.FactoryPattern;


/**
 * 
 */
public class FactoryProducer {
    /**
     * @return
     */
	public AbstractFactory getFactory(boolean rounded) {
		if(rounded) {
			return new RoundedShapeFactory();
		} else {
			return new ShapeFactory();
		}
	}

}