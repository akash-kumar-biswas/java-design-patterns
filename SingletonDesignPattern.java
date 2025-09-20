
class Singleton{
    private static Singleton ins = null;

    private Singleton(){}

    public static Singleton getInstance(){
        if(ins == null){
            ins = new Singleton();
        }
        return ins;
    }

    /*
-->Thread safety version
public static synchronized Singleton getInstance() {
    if (ins == null) {
        ins = new Singleton();
    }
    return ins;
}

-->double-checked locking for better performance
 public static Singleton getInstance() {
    if (ins == null) {
        synchronized (Singleton.class) {
            if (ins == null) {
                ins = new Singleton();
            }
        }
    }
    return ins;
}
 */

}


public class SingletonDesignPattern {
    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        System.out.println("Hashcode: "+x.hashCode());
        System.out.println("Hashcode: "+y.hashCode());
        System.out.println("Hashcode: "+z.hashCode());
    }
}
