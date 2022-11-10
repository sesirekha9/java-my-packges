package Mypackage;
class base1 {
    int j ; String name;
    public void get1(){
        System.out.println(j);
        System.out.println(name);
    }
    public void  met1(){
        int x=j*3;
        System.out.println(j);
        System.out.println(name.length());
    }
}
public class class_den {

    public static void main(String[] args) {
        base1 bs=new base1 ();
        bs.j=345; bs.name="rekha";
        bs.get1();
        bs.met1();
    }
}










