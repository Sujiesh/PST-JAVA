import java.io.*;
import java.util.*;
import java.util.function.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {

    public PerformOperation isOdd() {
        return (a) -> a % 2 != 0;
    }

    public PerformOperation isPrime() {
        return (a) -> {
            if (a <= 1) return false;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) return false;
            }
            return true;
        };
    }

    public PerformOperation isPalindrome() {
        return (a) -> {
            int original = a, rev = 0;
            while (a > 0) {
                rev = rev * 10 + a % 10;
                a /= 10;
            }
            return original == rev;
        };
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyMath obj = new MyMath();

        int T = sc.nextInt();

        while (T-- > 0) {
            int choice = sc.nextInt();
            int num = sc.nextInt();

            PerformOperation op;

            if (choice == 1) {
                op = obj.isOdd();
                System.out.println(op.check(num) ? "ODD" : "EVEN");
            } 
            else if (choice == 2) {
                op = obj.isPrime();
                System.out.println(op.check(num) ? "PRIME" : "COMPOSITE");
            } 
            else if (choice == 3) {
                op = obj.isPalindrome();
                System.out.println(op.check(num) ? "PALINDROME" : "NOT PALINDROME");
            }
        }
    }
}