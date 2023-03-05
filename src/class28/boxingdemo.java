package class28;

import java.util.ArrayList;

public class boxingdemo {
    public static void main(String[] args) {
        Integer integer=new Integer(10);//Boxing
        int number=integer;//auto unboxing
        int num=integer.byteValue();//unboxing

        double d=12.3;
        Double wrapperd=new Double(d);//boxing
        Double wrapperp=d;//auto boxing

        Float f=12.4f;
        ArrayList<Double>arrayList=new ArrayList<>();
        arrayList.add(12.4);
        double fg=12;


    }
}
