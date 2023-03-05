package class17;

public class studenttester {
    public static void main(String[] args) {
        student studentes=new student();
        studentes.name="zafar";
        studentes.id="123";
        studentes.schoolname="syntex";
        studentes.age=22;
        studentes.weight=70;

        student studentes1=new student();
        studentes1.name="hamid";
        studentes1.id="456";
        studentes1.age=5;
        studentes1.weight=86;
        studentes1.schoolname="syntex";

        student studentes2=new student();
        studentes2.name="hamid";
        studentes2.id="456";
        studentes2.age=5;
        studentes2.weight=86;
        //studentes2.schoolname="syntex";
        System.out.println(studentes2.schoolname);

    }





}
