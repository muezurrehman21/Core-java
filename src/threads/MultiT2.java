package threads;

class Process3 extends Thread{

    int i;
    @Override
    public void run() {
        for (i=0; i<=10; i++){
            System.out.println("Process1 : "+i);
        }
    }
}

class Process4 extends Thread{

    int i;
    @Override
    public void run() {
        for (i=0; i<=10; i++){
            System.out.println("Process2 : "+i);
        }
    }
}

public class MultiT2 {
    public static void main(String[] args) {
        Process3 p3 =new Process3();
        Process4 p4 = new Process4();
        p3.start();
        p4.start();
    }
}
