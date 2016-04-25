import java.util.*;

/*
#numeric #integer #gcd #factoring
Status : DONE
*/

public class GCD {
    private static int gcd(int a, int b) {
        int current_gcd = 1;
        for(int d = 2; d <= a && d <= b; ++d) {
            if (a % d == 0 && b % d == 0) {
                if (d > current_gcd) {
                    current_gcd = d;
                }
            }
        }

        return current_gcd;
    }


    private static int fastGcd(int a, int b)
    {
        if (b == 0)
        {
            return a;
        }
        return fastGcd(b, a%b );
    }

    public static void main(String args[]) {
        int a,b;
/**
         long valueCanonical = 0;
         long valueFast = 0;
         Random generator = new Random();
         while (true)
         {
             a = generator.nextInt(10) + 10;
             b = generator.nextInt(10) + 10;
             System.out.print(" TESTING with a = "+ a +"b=" +b );
             valueCanonical = gcd(a,b);

             valueFast = fastGcd(a,b);

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
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println(fastGcd(a, b));
    }
}
