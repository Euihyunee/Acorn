package uml;


public class FactoryPatternDemo {


    public static void main(String[] args) {
        // TODO implement here
    	Shape sp1 = ShapeFactory.getShape("Rectangle");
    	Shape sp2 = ShapeFactory.getShape("Circle");
    	Shape sp3 = ShapeFactory.getShape("Squre");
    	sp1.draw();
    	sp2.draw();
    	sp3.draw();
    }

}