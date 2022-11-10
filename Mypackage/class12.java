package Mypackage;
class abc{
    int x; int y;
    public void add(){
        System.out.println(x+y);
    }
}
class bcd extends abc{
    public void sub(){
        System.out.println(x-y);
    }
}
public class class12 {
    public static void main(String[] args) {
        abc a=new abc();
        a.x=5; a.y=3;
        a.add();
        bcd b=new bcd();
        b.x=4; b.y=2;
        b.sub();

    }
}
