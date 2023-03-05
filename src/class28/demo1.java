package class28;

import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String>words=new ArrayList<>();
        words.add("cat");
        words.add("java");
        words.add("lava");
        words.add("computer");

      /*  for (String s:words
             ) {if(s.endsWith("a")){
                 words.remove(s);
        }

        }*/
        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).endsWith("a")){
                words.remove(i);
            }
        }


        System.out.println(words);

    }
}
