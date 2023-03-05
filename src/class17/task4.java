package class17;

public class task4 {
        boolean isPrime(int a){
            boolean flag=true;
            if (a>1){
                for (int i = 2; i < a; i++) {
                    if (a%i==0) {
                        flag = false;
                        break;
                    }
                }

            }else {
                flag = false;
            }
            return flag;}


    public static void main(String[] args) {
        task4 num=new task4();
        System.out.println(num.isPrime(9));
    }
}
