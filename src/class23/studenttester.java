package class23;

public class studenttester {
    public static void main(String[] args) {
        student [] STUDENTS={new CoolegeStudent(),new SchoolStudent(),new SyntaxStudent()};
        for (student Student:STUDENTS){
            Student.commming();
            Student.study();
            Student.weekend();
        }
    }
}
