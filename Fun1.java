import java.util.Scanner;
public class Fun1 {
            public void arithmeticOperations(int a, int b) {
                System.out.println("Arithmetic Operations:");
                System.out.println("Addition: " + (a + b));
                System.out.println("Subtraction: " + (a - b));
                System.out.println("Multiplication: " + (a * b));
                if (b != 0) {
                    System.out.println("Division: " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero!");
                }
            }
            public void swapNumbers(int num1, int num2)
            {
                    System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
                    int temp = num1;
                    num1 = num2;
                    num2 = temp;
                    System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
            }
            public void checkPalindrome(int num)
            {
                int reversedNum = 0;
                int originalNum = num;
                while (num != 0) {
                int remainder = num % 10;
                reversedNum = reversedNum * 10 + remainder;
                 num /= 10;
            }
            if (originalNum == reversedNum)
            {
                     System.out.println(originalNum + " is a palindrome.");
            }
            else
            {
                System.out.println(originalNum + " is not a palindrome.");
            }
            }
            public void reverseNumber(int num)
            {
                   int reversedNum = 0;
                   while (num != 0)
                   {
                   int remainder = num % 10;
                   reversedNum = reversedNum * 10 + remainder;
                    num /= 10;
                   }
                   System.out.println("Reversed number: " + reversedNum);
            }

    public static void main(String[] args) {
        Fun1 f = new Fun1();
        f.arithmeticOperations(18, 9);
        f.swapNumbers(2, 7);
        f.checkPalindrome(1666666661);
        f.reverseNumber(1234576);
        }

}
