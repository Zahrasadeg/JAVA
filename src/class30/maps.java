package class30;

import java.util.HashMap;
import java.util.Map;

public class maps{
    public static void main(String[] args) {
        Map<Integer,String>studentmap=new HashMap<>();
        studentmap.put(1,"nazir");
        studentmap.put(2,"asdfr");
        studentmap.put(3,"rfghr");
        studentmap.put(4,"sdfg");
        System.out.println(studentmap);
        System.out.println(studentmap.get(3));
        System.out.println(studentmap.size());
        System.out.println(studentmap.containsKey(5));
        System.out.println(studentmap.containsValue("nazir"));
        System.out.println(studentmap.remove(1));
        System.out.println(studentmap);
    }
}
