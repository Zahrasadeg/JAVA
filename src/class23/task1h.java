package class23;

public class task1h {//Create a Class Computer that will have 4 subclasses as
    // Apple, Lenovo, HP, Dell.Define common behavior within and some fields in parent class
    // and override some of the methods in child classes
//Define some methods specific to child classes
//Create objects of child classes and store them into array.
//Loop through each object and execute available methods
    public static void main(String[] args) {
        computer [] computrs={new Apple(),new HP()};
        for (computer com:computrs){
            com.playvidio();
            com.browser();
        }
    }
}
class computer{
    int RAM;
    int storage;
    String OS;
    void playvidio(){
        System.out.println("playing vedio");
    }
    void browser(){
        System.out.println("browse internet");
    }
}
class Apple extends computer{
    @Override
    void playvidio() {
        System.out.println("playing in apple tv");
    }

    @Override
    void browser() {
        System.out.println("safari browser");
    }
    void installApp(){
        System.out.println("from app store");
    }
}
class HP extends computer{
    @Override
    void browser() {
        System.out.println("browsing using chrome");
    }

    @Override
    void playvidio() {
        System.out.println("playing in VLC player");
    }
}
