package class17;

public class Student1 {
    String name;
    String ID;
    static int numberofstudent;

    public static void main(String[] args) {
        Student1 st=new Student1();
        st.name="zahra";
        st.ID="1";
        st.numberofstudent++;

        st.name="asd";
        st.ID="2";
        st.numberofstudent++;
        System.out.println(Student1.numberofstudent);

    }

}
