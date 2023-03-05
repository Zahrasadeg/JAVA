package class27;

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        ArrayList<Character> characters=new ArrayList<>();
        characters.add('a');
        characters.add('d');
        characters.add('r');
        characters.add('k');
        characters.add('l');
        characters.add('q');
        System.out.println(characters);


        for(Character c:characters){
            System.out.println(c);
        }
    }
}
