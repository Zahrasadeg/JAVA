package class19;

public class furniture {
    String type;
    double price;
    String color;
    furniture(String type,double price,String color){
        this.type=type;
        this.price=price;
        this.color=color;
    }
    void print(){
        System.out.println(type+" price is "+price+" and the color is "+ color);
    }
}
