import java.util.Scanner;

/*
#numeric #integer #fibonacci
Status : DONE
*/

public class Fib {
    private static long calc_fib(int n) {
        if (n <= 1)
            return n;

        return calc_fib(n - 1) + calc_fib(n - 2);
    }

    private static long calcFibFast(int n) {
        if (n == 0) return 0;

        if (n == 1) return 1;
        if (n == 2 ) return 1;

        long lastFib = 1;
        long currentFib = 1;
        long tempFib = 0;
        for ( int i = 3; i<=n; i++ )
        {
            tempFib = currentFib;
            currentFib = currentFib + lastFib;
            lastFib = tempFib;
        }
        return currentFib;
    }

    public static void main(String args[]) {
        //Random generator = new Random();
        int n = 0;
/**     - Stress testing
        long valueCanonical = 0;
        long valueFast = 0;

        while (true)
        {
             n = generator.nextInt(10) + 10;


             System.out.print(" TESTING with n = "+ n);
             valueCanonical = calc_fib(n);

             valueFast = calcFibFast(n);

             if (valueCanonical == valueFast)
             {
                 System.out.print(" OK ");
                 System.out.println(" valueCanonical="+valueCanonical+ " valueFast = "+ valueFast);
             }
            else
             {
                 System.out.print(" ERROR ");
                 System.out.println(" valueCanonical="+valueCanonical+ " valueFast = "+ valueFast);
                 break;
             }


        }
**/
        Scanner in = new Scanner(System.in);
         n = in.nextInt();

        System.out.println(calcFibFast(n));
    }
}
