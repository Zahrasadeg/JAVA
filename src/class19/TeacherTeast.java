package class19;

public class TeacherTeast {
    public static void main(String[] args) {
        Teacher a=new Teacher();
        a.name="hasti";
        a.lastname="zamani";
        a.comming();
        a.ending();

        Mathteacher f=new Mathteacher();
        f.name="gosh";
        f.lastname="staduo";
        f.comming();
        f.ending();f.math();

        chemistryteacher j=new chemistryteacher();
        j.name="kora";
        j.lastname="jodi";
        j.comming();
        j.ending();
        j.chemistry();

        pianoteacher m=new pianoteacher();
        m.name="bashak";
        m.lastname="kori";
        m.piano();
        m.comming();
        m.ending();


    }
}
