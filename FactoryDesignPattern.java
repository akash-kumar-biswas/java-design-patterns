interface Shape {
    public void draw();
}

class Circle implements Shape{
    public void draw(){
        System.out.println("Draw Circle");
    }
}

class Square implements  Shape{
    public void draw(){
        System.out.println("Draw Square");
    }
}

class ShapeFactory{
    public static Shape getShape(String shapeType){
        if(shapeType == null)
            return null;
        else if(shapeType.equalsIgnoreCase("circle"))
            return new Circle();
        else if(shapeType.equalsIgnoreCase("square"))
            return new Square();
        else
            return null;
    }
}

public class FactoryDesignPattern {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("CIRCLE");
        shape.draw();

        shape = ShapeFactory.getShape("square");
        shape.draw();
    }
}
