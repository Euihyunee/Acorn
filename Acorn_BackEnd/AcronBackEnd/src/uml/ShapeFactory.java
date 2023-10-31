package uml;


/**
 * 
 */
public class ShapeFactory{
    /**
     * Default constructor
     */
    public ShapeFactory() {
    }

    /**
     * @return
     */
    public static Shape getShape(String type) {
        // TODO implement here
    	if(type.equals("Squre")) {
    		return new Square();	
    	}else if(type.equals("Rectangle")) {
    		return new Rectangle();
    	}else if(type.equals("Circle")) {
    		return new Circle();
    	}
    	return null;
    	
    }


}