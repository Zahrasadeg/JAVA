package class18;

public class grade {
    String name;
    String family;
    int mathgrade;
    int historygrde;
    int sincegrade;
    grade (String Name,String Family,int History,int Math,int Since) {
        name = Name;
        family=Family;
        historygrde=History;
        mathgrade=Math;
        sincegrade=Since;
    }
    void average(){
        System.out.println("the average of " + name + " " + family + " is " + (historygrde + mathgrade + sincegrade %3));

    }
}
