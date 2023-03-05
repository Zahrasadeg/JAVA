package class20;

public class phone {
    String name;
    String mobilenum;

    phone(String name,String mobilenum){
        this.name=name;
        this.mobilenum=mobilenum;
    }
}
class userinfo extends phone{
    String address;
    userinfo(String name,String mobilenum,String address){
        super(name, mobilenum);
        this.address=address;
    }
    void print(){
        System.out.println(name+" with this phone number "+mobilenum+" have this address"+address);

    }
}