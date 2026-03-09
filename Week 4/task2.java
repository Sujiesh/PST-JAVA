import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		while (T-- > 0) {
			String s = sc.next();
			int n = s.length();

			int[] freq1 = new int[26];
			int[] freq2 = new int[26];

			for (int i = 0; i < n / 2; i++) {
				freq1[s.charAt(i) - 'a']++;
			}
			
			int start = (n % 2 == 0) ? n / 2 : n / 2 + 1;
			for (int i = start; i < n; i++) {
				freq2[s.charAt(i) - 'a']++;
			}

			boolean lapindrome = true;
			for (int i = 0; i < 26; i++) {
				if (freq1[i] != freq2[i]) {
					lapindrome = false;
					break;
				}
			}

			System.out.println(lapindrome ? "YES" : "NO");
		}
		sc.close();
	}
}
