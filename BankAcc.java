import java.util.Scanner;
public class BankAcc {
    private int accno;
    private int balance;
    BankAcc(int no , int bal){
        accno = no;
        balance = bal;
    }
    public void deposit(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        int amount = input.nextInt();
        balance += amount;
    }
    public void withdraw(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount to withdarw :");
        int amount = input.nextInt();
        if (amount<balance){
            balance -= amount;
        }
    }
    public void checkBalance(){
        System.out.println("Balance in your account :"+balance);
    }
    public static void main(String[] args) {
        BankAcc obj = new BankAcc(123,0);
        obj.checkBalance();
        obj.deposit();
        obj.checkBalance();
        obj.withdraw();
        obj.checkBalance();
    }
}
