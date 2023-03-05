package class30;

import java.util.HashMap;
import java.util.Set;

public class MapBuilding {
    public static void main(String[] args) {
        HashMap<Integer,String> company=new HashMap<>();
        company.put(1,"Google");
        company.put(2,"Syntax");
        company.put(3,"Microsoft");
        company.put(4,"apple");
        company.put(5,"Samsung");
        company.put(6,"youtube");
        company.put(7,"facebook");
        company.put(4,"tweeter");
        company.remove(7);
        System.out.println(company);


        Set<Integer> allkeys=company.keySet();
        System.out.println(allkeys);
        for(Integer s:allkeys){
            System.out.println(s);
        }

    }
}
