
import java.util.Scanner;

public class ReverseString {
    static void reString(char[] s, int l) {
        if (l == 0)
            return;
        System.out.print(s[l - 1]);
        l--;
        reString(s, l);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char chararr[] = new char[s.length()];
        chararr = s.toCharArray();
        reString(chararr, chararr.length);

    }
}
// Given a string S, write a program to reverse it.
