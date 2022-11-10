package Mypackage;
class Car{
    int b; String carname;
    public void get1() {
        System.out.println(b);
        System.out.println(carname);
    }
    public void  met1(){
        int x=b;
        System.out.println(b);
        System.out.println(carname.length());
    }
}

public class car_class {
    public static void main(String[] args) {
        base1 bs=new base1 ();
        bs.j=25; bs.name="ford";
        bs.get1();
        bs.met1();

    }
}
