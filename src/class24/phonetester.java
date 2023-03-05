package class24;

public class phonetester {
    public static void main(String[] args) {


        phone[] phones = {new iphone(), new samsung()};
        for (phone PHONE : phones){
            PHONE.unlockphone();
            PHONE.sendtext();
        }
    }
}