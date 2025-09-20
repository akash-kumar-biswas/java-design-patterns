interface Color{
    void applyColor();
}

class RedColor implements Color{
    public void applyColor(){
        System.out.println("Red Color");
    }
}

class BlueColor implements  Color{
    public void applyColor(){
        System.out.println("Blue Color");
    }
}

abstract class Shape{
   protected  Color color;

   Shape(Color color){
        this.color = color;
   }
   abstract void draw();
}

class Circle extends Shape{
    public Circle(Color color) {
        super(color);
    }

    public void draw(){
        System.out.print("Draw Circle with ");
        color.applyColor();
    }
    
}

class Square extends Shape{
    public Square(Color color) {
        super(color);
    }

    public void draw(){
        System.out.print("Draw Square with ");
        color.applyColor();
    }
    
}

public class BridgeDesignPattern {
    public static void main(String[] args) {
        Shape shape = new Circle(new RedColor());
        shape.draw();
        shape = new Square(new BlueColor());
        shape.draw();
    }
}
