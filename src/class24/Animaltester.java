package class24;

public class Animaltester {
    public static void main(String[] args) {
        Animal [] arr={new bird(),new cat(),new dog()};
        for(Animal ani:arr){
            ani.eat();
            ani.speak();
        }
    }
}
