package class20;

public class parent {
    String name;
    static String lastname;
    // parent(){
     //   System.out.println("i am a parent child class");
    //}

    public static void main(String[] args) {
        parent p=new parent();

    }
    public void hello(){
        System.out.println("public hello from parent clss");
    }
    protected static void bye(){
        System.out.println("protected method bye from parent class");
    }
    private void money(){
        System.out.println("private methods from parents class");
    }
}
