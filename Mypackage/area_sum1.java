package Mypackage;

public class area_sum1 {
    public static int sum(int ...numbers){
        int sum=0;
        for (int j=0; j<numbers.length; j++){
            sum= sum+numbers[j];
        }return sum ;
    }

    public static void main(String[] args) {

        area_sum1 ac=new area_sum1();


        System.out.println( ac.sum(4,5,6,7,8,9));


    }
}
