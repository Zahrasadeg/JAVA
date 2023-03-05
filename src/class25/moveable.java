package class25;

public interface moveable {
    void move();
}
class car implements moveable{
    @Override
    public void move() {
        System.out.println("i can move");
    }
}
class dog implements moveable{
    @Override
    public void move() {
        System.out.println("i can move");

    }
}