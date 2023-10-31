package DesignPattern.FactoryPattern;

/**
 * 
 */
public class RoundedShapeFactory extends AbstractFactory {

    /**
     * Default constructor
     */
    public RoundedShapeFactory() {
    }

    /**
     * @return
     */
    @Override
    public Shape getShape(String type) {
    	if(type.equals("RoundRectangle")) {
        	return new RoundRectangle();
        }else if(type.equals("RoundedSquare")) {
        	return new RoundedSquare();
        }
        return null;
    }

}