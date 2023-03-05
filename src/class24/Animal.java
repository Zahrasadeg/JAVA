package class24;

public abstract class Animal {
    //define the speak eat methods and create 3 sub class
 void eat(){
    System.out.println("Animals eating");
}
abstract void speak();
}
class cat extends Animal{
    @Override
    void eat() {
        System.out.println("cat eat fish");
    }

    @Override
    void speak() {
        System.out.println("meio meio");
    }
}
class dog extends Animal{
    @Override
    void eat() {
        System.out.println("eat ");
    }

    @Override
    void speak() {
        System.out.println("Bark Bark");
    }
}
class bird extends Animal{
    @Override
    void eat() {
        System.out.println("eating nuts");
    }

    @Override
    void speak() {
        System.out.println("tweet tweet");
    }
}
