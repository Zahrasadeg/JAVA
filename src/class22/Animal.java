package class22;

public class Animal {
    String name;
    String age;
    void speak(){
        System.out.println("Animals talking");
    }
}
class cat extends Animal{
    void speak(){
        super.speak();
        System.out.println("meio meio");
    }

    public static void main(String[] args) {
        cat c=new cat();
        c.speak();
    }}