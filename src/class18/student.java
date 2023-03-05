package class18;

public class student {String name;
    String id;
    int age;
    double weight;
    student (String Name, String Id,int Age,double Weight){
        id=Id;
        name=Name;
        age=Age;
        weight=Weight;

    }
    void print(){
        System.out.println(name+" "+id+" "+age+" "+weight);
    }
}
