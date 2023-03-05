package class26;

public class Acount {
    private double balance;
    private String accountnum;
    private String type;
    private String acounttitle;
    public void setBalance(double balance){
        if(balance<0){
            System.out.println("negative balance is not allowed");
        }else {
            this.balance=this.balance+balance;
        }
    }
    public double getBalance(){
        return balance;
    }
    public void setAccountnum(String accountnum){
        if(accountnum.length()!=16){
            System.out.println("wrong account");
        }
    }
    public String getAccountnum(){
        return accountnum;
    }

    public String getaccounttitle(){
        return acounttitle;
    }

    public Acount(double balance, String accountnum, String type, String acounttitle) {
        this.balance = balance;
        this.accountnum = accountnum;
        this.type = type;
        this.acounttitle = acounttitle;
    }
}
class Accounttester{
    public static void main(String[] args) {
        Acount acc=new Acount(1000,"sdfg","sdf","sdfsd");
        System.out.println(acc.getaccounttitle());




    }
}