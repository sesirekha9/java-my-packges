package Mypackage;

public class area_class {
    public static int prod(int ...numbers){
        int product=1;
        for (int j=0; j<numbers.length; j++){
            product=product*numbers[j];
        }return product;
    }

    public static void main(String[] args) {

        area_class ac=new area_class();


        System.out.println( ac.prod(1,2,3,4,5,6));


    }
}

