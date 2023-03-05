package class20;

public class employee {//Create an Employee class that will have variables and methods.
    // Constructor that should initialize instance variables
    //Create 2 subclasses FullTime and PartTime Employees
    // that should have own variables and methods.
    //Create a Tester Subclass from FullTime Employee and add
    // some features and methods to the Tester Class.
    String name;
    String id;
    employee(String name,String id){
        this.name=name;
        this.id=id;
    }

}
class parttime extends employee{
    String starttime;
    parttime(String name,String id,String starttime){
        super(name, id);
        this.starttime=starttime;
    }
    void ptp(){
        System.out.println(name+" "+id+" start at "+starttime);
    }
}
class fulltime extends employee{
    String posation;
    fulltime(String name,String id,String posation){
        super(name, id);
        this.posation=posation;
    }
    void ftp(){
        System.out.println(name+" "+id+" at "+posation+" working full time");
    }
}