import java.util.Scanner;

public class Print1toN {
    static void print1ToN(int n, int i) {
        if (n == 0)
            return;
        i++;
        System.out.println(i);
        print1ToN(n - 1, i);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print1ToN(n, 0);
    }
}
