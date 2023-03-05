package class28;

import java.util.LinkedList;

public class linked {
    public static void main(String[] args) {
        LinkedList<String>sub=new LinkedList<>();
        sub.add("SDLC");
        sub.add("manual testing");
        sub.add("jira");
        sub.add("git");
        sub.add("java");
        LinkedList<String>futuresub=new LinkedList<>();
        futuresub.add("selenium");
        futuresub.add("testing");
        futuresub.add("cucumber");
        futuresub.add("sql");
        futuresub.add("jenkins");
        System.out.println(futuresub);
        LinkedList<String>allsub=new LinkedList<>();
        allsub.addAll(sub);
        allsub.addAll(futuresub);
        System.out.println(allsub);

        LinkedList <String> sublike=new LinkedList<>();
        sublike.add("java");
        sublike.add("SDLC");
        sublike.add("SQL");
        System.out.println(sublike);
        allsub.removeAll(sublike);
        System.out.println(allsub);
    }
}
