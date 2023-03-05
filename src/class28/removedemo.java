package class28;

import java.util.ArrayList;
import java.util.Iterator;

public class removedemo {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("cat");
        words.add("java");
        words.add("lava");
        words.add("computer");
        words.removeIf(s -> s.endsWith("a"));
        System.out.println(words);
    }
}
