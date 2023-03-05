package class27;

public class Demo1 {
    public static boolean search(String name, String[] names) {
        for (String n : names) {
            if (name.equals(n)) {
                return true;
            }
        }return false;
    }
    public static void main(String[] args) {
        String name="nima";
        String [] names ={"hiral","nima","lura","nat"};
        displayname(names);
        System.out.println(search(name,names));
    }
    public static void displayname(String [] names){
        for(String name:names){
            System.out.println(name);
        }
    }
}
