package class19;

public class Animal {
    void eat(){
        System.out.println("animal eating from Animal class");
    }
    void sleep(){
        System.out.println("animal sleeping from Animal class");
    }

}
class bird extends Animal{
    void fly(){
        System.out.println("bird flying");
    }

}

class bear extends Animal{
     void rorring() {
         System.out.println("bear rorring");}
}
