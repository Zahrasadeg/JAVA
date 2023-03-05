package class20;

public class circle {
    //Write program: Shape class has a constructor that
    // takes the radius and has a subclass as  circle class. In circle class create
    // a method to calculate the area of circle. Test your code
    int r;
    circle(int r){
        this.r=r;
    }

}
class area extends circle{
    float pi;
    int a;
    area(float pi,int a,int r){
        super(r);
        this.pi=pi;
        this.a=a;
    }
    void calculate(){
        System.out.println("the area of circle is equal to "+(a*pi*r));
    }
}