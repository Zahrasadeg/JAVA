package class20;

public class child1 extends parent{
    public static void main(String[] args) {
        child1 c1=new child1();
        c1.hello();
        c1.bye();
        parent.bye();
        child1.bye();
        //c1.money();//private
    }
}
