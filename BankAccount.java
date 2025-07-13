import java.util.Scanner;

public class BankAccount {
    String name;
    int accNo;
    int balance;

    BankAccount(String n, int a, int b) {
        name = n;
        accNo = a;
        balance = b;
    }
    void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }
    void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Not enough balance");
        }
    }
    int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        int balance = sc.nextInt();

        BankAccount b = new BankAccount(name, accNo, balance);

        System.out.print("Enter amount to deposit: ");
        int dep = sc.nextInt();
        b.deposit(dep);

        System.out.print("Enter amount to withdraw: ");
        int w = sc.nextInt();
        b.withdraw(w);

        int finalBalance = b.getBalance();
        System.out.println("Final Balance: " + finalBalance);

        String status = (finalBalance >= 5000) ? "Minimum Balance Maintained" : "Minimum Balance Not Maintained";
        System.out.println("Status: " + status);


    }
}
