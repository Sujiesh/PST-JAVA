import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        int count = 0;

        for(char c : input.toCharArray()){
            if(Character.isDigit(c)){
                count++;
            }
        }

        System.out.println(count);
    }
}