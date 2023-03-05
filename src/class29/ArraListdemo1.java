package class29;

import java.util.ArrayList;

public class ArraListdemo1 {
    public static void main(String[] args) {
        //dog d1=new dog("jacky","persian",15);
        ArrayList<dog>dogs=new ArrayList<>();
        dogs.add(new dog("jacky","persian",15));
        dogs.add(new dog("jami","german",15));
        dogs.add(new dog("jija","buldog",3));
        dogs.add(new dog("mami","dfg",34));
        for(dog dogz:dogs){
dogz.printdogname();
        }


    }
}
