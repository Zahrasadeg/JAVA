package class17;

public class MPractice4 {
    //create a methods that return the lage numer

    int largernumber(int a,int b) {
        if(a>b){
            return a;
        }else{
            return b;
        }

    }

    public static void main(String[] args) {
        MPractice4 mp=new MPractice4();
        System.out.println(mp.largernumber(13,67));
    }
}


