package class27;

import java.util.ArrayList;

public class arrayc {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("Fizzy");
        names.add("savo");
        names.add("sam");
        names.add("urwa");
        names.add("tarik");
        names.add("abeera");
        System.out.println(names.contains("Darya"));
        System.out.println(names);
        names.remove("sam");
        System.out.println(names);
        names.set(3,"sam");
        System.out.println(names);
        System.out.println(names.indexOf("savo"));

    }
}
