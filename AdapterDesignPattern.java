interface Railroad{
    void vehicleMoving();
}

class Car{
    public void drive(){
        System.out.println("The Car is driven");
    }
}

class Adapter implements Railroad{
    private Car car;

    public Adapter(Car car) {
        this.car = car;
    }

    public void vehicleMoving(){
        car.drive();
    }
}


public class AdapterDesignPattern {
    public static void main(String[] args) {
        Railroad railroad = new Adapter(new Car());
        railroad.vehicleMoving();
    }
}
