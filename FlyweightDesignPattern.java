
import java.util.HashMap;
import java.util.Map;

interface Shape{
    void draw();
}

class Circle implements Shape{
    private String color;  //shared intrisic variable

    public Circle(String color) {
        this.color = color;
    }
    
    public void draw(){
        System.out.println("Drawing circle with color: "+ color);
    }
}

class ShapeFactory{
    private static Map<String, Shape> cirMap = new HashMap<>();

    public static Shape getCircle(String color){
        Circle circle = (Circle)cirMap.get(color);

        if(circle == null){
            circle = new Circle(color);
            cirMap.put(color, circle);
            System.out.println("Creating new circle with color "+ color);
        }
        else{
            System.out.println("Returning the already existing circle of color "+ color);
        }
        return circle;
    }
}
public class FlyweightDesignPattern {
    public static void main(String[] args) {
        Shape redCircle = ShapeFactory.getCircle("Red");
        redCircle.draw();
        Shape redCircleAgain = ShapeFactory.getCircle("Red");
        redCircleAgain.draw();
        Shape blueCircle = ShapeFactory.getCircle("Blue");
        blueCircle.draw();

    }
}
