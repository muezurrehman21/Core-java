package threads;
import java.util.Scanner;

class BankAccount{
    int balance;
    BankAccount(int bal){
        balance = bal;
    }
    boolean sufficientBalance(int amount){
        if (amount <= balance){
            return true;
        }
        else {
            return false;
        }
    }
    void withdraw(int amt, String cutomerName){
        if (sufficientBalance(amt)){
            System.out.println("Withdraw Succesful for "+cutomerName);
            balance = balance - amt;
            System.out.println("Current amount for"+ cutomerName+ " is :" + balance);
        }
        else {
            System.out.println("Insuficient Balance for "+cutomerName);
        }
    }
}
class Customer implements Runnable{
    BankAccount BA1;
    String cutomerName;

    Customer(BankAccount BA, String custName){
        BA1 = BA;
        cutomerName = custName;
    }
    public void run() {
        synchronized (BA1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your amount " + cutomerName + " : ");
            int amount = sc.nextInt();
            BA1.withdraw(amount, cutomerName);
        }
    }
}

public class MultiThreadingSynchronization {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(5000);
        Customer c1 = new Customer(ba,"Muez");
        Customer c2 = new Customer(ba,"Ibrahim");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}
