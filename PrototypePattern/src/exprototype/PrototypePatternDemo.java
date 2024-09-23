package exprototype;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        
        Shape clonedRectangle = (Shape) rectangle.clone();
        Shape clonedCircle = (Shape) circle.clone();
        Shape clonedTriangle = (Shape) triangle.clone();

        // Testando a clonagem
        System.out.println("Shape: " + clonedRectangle.getType());
        clonedRectangle.draw();
        
        System.out.println("Shape: " + clonedCircle.getType());
        clonedCircle.draw();

        System.out.println("Shape: " + clonedTriangle.getType());
        clonedTriangle.draw();
    }
}
