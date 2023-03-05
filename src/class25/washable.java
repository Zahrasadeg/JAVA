package class25;
public interface washable{
    void wash();
}
class smartwatch implements washable {
    @Override
    public void wash() {
        System.out.println("I am IP65 rated you can wash me");
    }
}
class phone implements washable{
    public void wash(){
        System.out.println("I am IP65 rated you can wash me");
    }

}
class inverter implements washable{
    public void wash(){
        System.out.println("I am IP65 rated you can wash me");
}
}