package class29;

import java.util.HashSet;

public class SetStudent {
    String name;
    String id;

    public SetStudent(String name, String id) {
        this.name = name;
        this.id = id;
    }
    void display(){
        System.out.println(name+id);
    }

    public static void main(String[] args) {
        HashSet<SetStudent>students=new HashSet<>();
        students.add(new SetStudent("Aron","abd567"));
        students.add(new SetStudent("Ehsan","87hg"));
        students.add(new SetStudent("hamed","67jl"));
        for(SetStudent st:students){
            st.display();
        }
    }
}
