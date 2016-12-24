import java.util.Scanner;

/*
#DP
Status : DONE
*/
public class ChangeDP {

    public static int changeRecursive(int money, int[] coins)
    {
        if (money == 0)
        {
            return 0;
        }

        int currentCoins = 0;

        int minNumCoins = Integer.MAX_VALUE;

        for (int i =0; i < coins.length; i++)
        {
            if (money-coins[i]>=0)
                currentCoins = changeRecursive(money-coins[i] ,coins);

            if ((currentCoins+1) < minNumCoins)
            {
                minNumCoins = currentCoins+1;
            }
        }

        return minNumCoins;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(changeRecursive(n,new int[] {2, 3, 6}));
    }
}