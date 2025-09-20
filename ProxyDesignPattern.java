interface Image{
    void display();
}

class RealImage implements Image{
    private String fileName;
    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    public void loadFromDisk(String fileName){
        System.out.println("Load file "+ fileName);
    }

    public void display(){
        System.out.println("Displaying "+ fileName);
    }
}

class ProxyImage implements Image{
    private RealImage realImage = null;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    public void display(){
        if(realImage == null)
            realImage = new RealImage(fileName);
        realImage.display();
    }
}
public class ProxyDesignPattern {
    public static void main(String[] args) {
        Image image = new ProxyImage("xyz.jpg");
        image.display();

        image.display();
    }
}
