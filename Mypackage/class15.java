package Mypackage;

public class class15 {
    int a; int b; int sum; int subtraction;

    public void glen(){
        a =5; b=5;
        sum=a+b;
        System.out.println(sum);


    }
    public void ben(int x,int y){ // parameters should be declared within  the method
       // int a=6; int b=4; int subtraction;
        subtraction=x*y;
        System.out.println(subtraction);

    }
    public static void main(String[] args){
        class15  h= new class15();
        h.glen();
        h.ben(8,4); // only values should be passed

    }
}
