package class27;

import java.util.ArrayList;

public class arrayb {
    public static void main(String[] args) {
        ArrayList<Boolean> booleans=new ArrayList<>();
        booleans.add(false);
        booleans.add(false);
        booleans.add(true);
        booleans.add(false);
        booleans.add(true);
       // System.out.println(booleans.get(3));
        /*for(Boolean b:booleans){
            System.out.println(b);
        }*/
        for (int i=0;i<booleans.size();i++){
            System.out.println(booleans.get(i));
        }
        int i=0;
        while (i<booleans.size()){
            System.out.println(booleans.get(i));
            i++;
        }

    }
}
