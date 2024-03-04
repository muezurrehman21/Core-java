interface interfaceClass {
    int a = 5;
    int b= 6;
    int sum(int a, int b);
}
interface interfaceClass2{

}
class InterfaceTestClass implements interfaceClass2,interfaceClass{
    int a;
    int b;

    @Override
    public int sum(int a, int b) {
        this.a = a;
        this.b = b;
        return this.a + this.b;
    }
}
public class MainInterfacePractice{
    public static void main(String[] args) {
        InterfaceTestClass inC = new InterfaceTestClass();
        int sum = inC.sum(5,9);
        System.out.println(sum);

//        System.out.println(interfaceClass2.b);
    }

}
