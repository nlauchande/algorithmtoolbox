import java.util.*;

/*
#numeric #integer #lcm #factoring
Status : DONE
*/

public class LCM {
    private static long lcm(long a, long b) {
        //write your code here
        return (a * b) / fastGcd(a,b);
    }

    private static long fastGcd(long a,long b)
    {
        if (b == 0)
        {
            return a;
        }
        return fastGcd(b, a%b );
    }


    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        System.out.println(lcm(a, b));
    }
}
