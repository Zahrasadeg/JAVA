package class24;

public abstract class file {
    int size;
    file(int size){
        this.size=size;
    }
    abstract void open();
    void edit(){
        System.out.println("u can delete or add folders");
    }
    void close(){
        System.out.println("file is closing");
    }
}
class javafile extends file{
    javafile(int size) {
        super(size);
    }

    void open(){
        System.out.println("for opening the java u need to notepad");
    }

    @Override
    void edit() {
        System.out.println("u cann add the class or package");
    }

    @Override
    void close() {
        super.close();
    }
}
class pdffile extends file{
    pdffile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("we need to install Microsoft");
    }

    @Override
    void edit() {
        System.out.println("u can print notes");
    }

    @Override
    void close() {
        super.close();
    }
}
class wordfile extends file{
    wordfile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("instal microsoft");
    }

    @Override
    void edit() {
        System.out.println("u can add pictures and notes");
    }

    @Override
    void close() {
        super.close();
    }
}