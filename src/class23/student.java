package class23;

public class student {
    public void commming(){
        System.out.println("students should come at 7 am");
    }
    public void study(){
        System.out.println("student should satudy");
    }
    public void weekend(){
        System.out.println("student can go home");
    }
}
class SyntaxStudent extends student{
    @Override
    public void commming() {
        System.out.println("Syntax student should come at 7");
    }

    @Override
    public void study() {
        System.out.println("syntax student should study");
    }

    @Override
    public void weekend() {
        System.out.println("syntax student can go home");
    }
}
class CoolegeStudent extends student{
    @Override
    public void commming() {
        System.out.println("coolage students should come at 7");
    }

    @Override
    public void study() {
        System.out.println("college students should stude more");
    }

    @Override
    public void weekend() {
        System.out.println("it is better to study in weekends");
    }
}
class SchoolStudent extends student{
    @Override
    public void commming() {
        System.out.println("scholl students should come 9");
    }

    @Override
    public void study() {
        System.out.println("dont need much study");
    }

    @Override
    public void weekend() {
        System.out.println("school student can play in weekends");
    }
}