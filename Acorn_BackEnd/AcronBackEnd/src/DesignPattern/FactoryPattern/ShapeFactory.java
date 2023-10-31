package DesignPattern.FactoryPattern;

/**
 * 
 */
public class ShapeFactory extends AbstractFactory {

    /**
     * Default constructor
     */
    public ShapeFactory() {
    }

    /**
     * @return
     */
    @Override
    public Shape getShape(String type) {
        if(type.equals("Rectangle")) {
        	return new Rectangle();
        }else if(type.equals("Square")) {
        	return new Square();
        }
        return null;
    }

}