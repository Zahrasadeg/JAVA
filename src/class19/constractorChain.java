package class19;

public class constractorChain {
    constractorChain(){
        System.out.println("i am a non argument constractor");
    }
    constractorChain(String str){
        this();
        System.out.println(str);
    }
    constractorChain(int number){
        this("hello");
        System.out.println("this is construcotr with int parameter");
    }

    public static void main(String[] args) {
        constractorChain obj=new constractorChain(10);
        System.out.println("----End of the code-----");

    }
}
