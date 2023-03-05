package class18;

public class array {
    int sumae (int []array){
        int sum=0;
        for(int num:array){
            sum+=num;
        }
        return sum;

    }

    public static void main(String[] args) {
        int [] arr={10,25,60};
        array pa=new array();
        System.out.println(pa.sumae(arr));
    }

}
