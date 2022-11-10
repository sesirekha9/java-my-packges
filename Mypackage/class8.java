package Mypackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class class8 {
    public static void main(String[] args) throws IOException {
        int day;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your day");
        day=Integer.parseInt(br.readLine());
        switch (day){
            case  1:
                // opration 1 (addition)
                System.out.println("monday");
                break;
            case  2:
                //operation 2(subsraction)
                System.out.println("Tuesday");
                break;
            case  3:
                //operation 2(multiplication)
                System.out.println("wednesday");
                break;
            case  4:
                //operation 2(multiplication)
                System.out.println("Thursday");
                break;
            case  5:
                System.out.println("Friday");
                break;
            case  6:
                System.out.println("saturday");
                break;
            case  7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("you have entered a wrong day");
        }


    }
}