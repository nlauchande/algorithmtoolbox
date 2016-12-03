import java.util.*;

/*
#numeric #integer #fibonacci
Status : DONE
*/

public class FibonacciLastDigit {

    private static int getFibonacciLastDigit(int n) {
        if (n <= 1)
            return n;

        return (getFibonacciLastDigit(n - 1) + getFibonacciLastDigit(n - 2)) % 10;
    }

    private static int getFibonacciLastDigitFast(int n) {
        if (n == 0) return 0;

        if (n == 1) return 1;
        if (n == 2 ) return 1;

        int lastFib = 1;
        int currentFib = 1;
        int tempFib = 0;
        for ( int i = 3; i<=n; i++ )
        {
            tempFib = currentFib;
            currentFib = (currentFib + lastFib) % 10;
            lastFib = tempFib;
        }
        return currentFib;
    }


    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int c = getFibonacciLastDigitFast(n);
        System.out.println(c);
    }
}