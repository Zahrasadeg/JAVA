package class19;

public class Teacher {
    String name;
    String lastname;
   /* Teacher(String name,String lastname){
        this.name=name;
        this.lastname=lastname;
    }*/

    void comming(){
        System.out.println(name+lastname+" should come to school at 8:45");
    }
    void ending(){
        System.out.println(name+" "+lastname+" can go home at 4:00pm");
    }
}
class Mathteacher extends Teacher{
    void math(){
        System.out.println(name+" "+lastname+" love to teach math");
    }
}

class chemistryteacher extends Teacher{
    void chemistry(){
        System.out.println(name+" "+lastname+" love to teach chemistry");
    }
}
class pianoteacher extends Teacher{
    void piano(){
        System.out.println(name+" "+lastname+" love music");
    }
}