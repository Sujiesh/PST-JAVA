import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int weight = 0;

        for(int i = 1; i <= n; i++) {

            // increasing part
            for(int j = 1; j <= i; j++) {
                weight += j;
            }

            // decreasing part
            for(int j = i-1; j >= 1; j--) {
                weight += j;
            }
        }

        System.out.println(weight);
    }
}