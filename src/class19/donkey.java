package class19;

public class donkey {
    String name;
    int age;
    double weight;


    donkey(String name,int age){
        this.name=name;
        this.age=age;

    }
    void print(){
       System.out.println("name of donkey is "+name+" and the age is "+age);
    }
}
