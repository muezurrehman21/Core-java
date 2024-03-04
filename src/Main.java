import javax.sound.midi.Soundbank;

abstract class Example{
    int a;
    String b;
    static String c;
    public void fun1(int a,String b){
        this.a=a;
        this.b=b;
        System.out.println(this.a+ Integer.parseInt(this.b)+Integer.parseInt(c));
        Integer i = this.a;
        int result = i;
        System.out.println(result);
    }
    public void display(){
        System.out.println("parent");
    }
    public static void main(String[] args) {
        System.out.println("test");
    }
}
class Example1 extends Example{
    public void display(){
        System.out.println("child");
    }
}
public class Main {
    static int y;
    public static void main(String[] args) {
        Example1 e1 = new Example1();
        e1.display();

    }

}
