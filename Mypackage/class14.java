package Mypackage;

public class class14 {
    int a; int b;


    public void mat(){
        int sum; int subtraction;
        a=3; b=6;
        sum=(a+b);
        subtraction=(b-a);
        System.out.println(sum);
        System.out.println(subtraction);

    }
    public void nut(){
        a=2; b=4;
        int division;
        division=(b/a);
        System.out.println(division);
        System.out.println(a*b);
    }

    public static void main(String[] args){
        class14 array= new class14();
        array.mat();
        array.nut();



    }
}
