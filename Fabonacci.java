import java.util.Scanner;

public class Fabonacci {
    static int fSeries(int n) {
        if (n <= 1)
            return n;
        return fSeries(n - 1) + fSeries(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(fSeries(i) + " ");
        }
        
    }
}