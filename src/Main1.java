abstract class AbstractClassExample {
    int a;
    int b;
    abstract public void fun1();
}
class Example2 extends AbstractClassExample{
    @Override
    public void fun1() {
        this.a = 3;
        this.b = 4;
    }
}
class Example3 extends AbstractClassExample{

    @Override
    public void fun1() {
        this.a = 8;
        this.b = 9;
    }
}

public class Main1{
    public static void main(String[] args) {
        Example2 ex2 = new Example2();
        ex2.fun1();
        System.out.println(ex2.a + " " + ex2.b);
        Example3 ex3 = new Example3();
        ex3.fun1();
        System.out.println(ex3.a + " " + ex3.b);
    }
}
