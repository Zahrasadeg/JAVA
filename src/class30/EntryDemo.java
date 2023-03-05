package class30;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class EntryDemo {
    public static void main(String[] args) {
        Set<Entry>entrySet=new LinkedHashSet<>();
        entrySet.add(new Entry(1,"nazir"));
        entrySet.add(new Entry(2,"ali"));
        entrySet.add(new Entry(3,"reza"));
        entrySet.add(new Entry(4,"safi"));
        entrySet.add(new Entry(5,"sara"));
        entrySet.add(new Entry(6,"hiral"));
        entrySet.add(new Entry(7,"saba"));

        entrySet.removeIf(x->x.getKey()>2 && x.getValue().contains("i"));
        System.out.println(entrySet);
    }
}
