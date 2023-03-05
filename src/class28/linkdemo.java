package class28;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkdemo {
    public static void main(String[] args) {
        long starttime=System.currentTimeMillis();
        ArrayList<String> num=new ArrayList<>();// if change the linked list to arraylist it is too much slower
        for (int i = 0; i < 1000; i++) {
        num.add(0,"test data");
        }
        long endtime=System.currentTimeMillis();
        System.out.println(endtime-starttime);
    }
}
