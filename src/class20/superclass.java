package class20;

public class superclass {
    superclass(){
        System.out.println("I am a constructor from the parent class");
    }
}
class subclass extends superclass{
       subclass(){
          super(); //makes a call to the parents class construction
           System.out.println("i am a child constructor"); }
}//if we clear the suer compailer add that automatically
