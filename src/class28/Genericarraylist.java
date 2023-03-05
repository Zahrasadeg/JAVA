package class28;

import java.util.ArrayList;

public class Genericarraylist {
    public static void main(String[] args) {
        ArrayList name=new ArrayList();
        name.add("Ehsan");
        name.add(10);
        name.add('f');
        for (Object j:name
             ) {
            System.out.println(j);
        }
    }
}
