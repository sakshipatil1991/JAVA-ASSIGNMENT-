import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int si, r;

        System.out.println("Enter principal amount:");
        int p = sc.nextInt();

        System.out.println("Enter time period (in years):");
        int t = sc.nextInt();

        if (p > 10000) {
            r = 10;
        } else if (p >= 5000) {
            r = 8;
        } else {
            r = 5;
        }

        si = (p * r * t) / 100;

        System.out.println("Interest Rate: " + r + "%");
        System.out.println("Simple Interest: " + si);


    }
}
