import java.util.*;

/*
#dp
Status : TODO
*/
public class Knapsack {
    static int optimalWeightOld(int W, int[] w) {
        //write you code here
        int result = 0;
        for (int i = 0; i < w.length; i++) {
          if (result + w[i] <= W) {
            result += w[i];
          }
        }
        return result;
    }

    static int discreteKnapsackRepetion(int W, int[] w)
    {
        return 0;
    }

    static int discreteKnapsackWithoutRepetion(int W, int[] piecesWeight) {
        int[][] value = new int[W + 1][piecesWeight.length+1];

        int n = piecesWeight.length;

        for (int i = 0; i < value[0].length; i++) {
            value[0][i] = 0;
        }

        for (int i = 0; i < value.length; i++) {
            value[i][0] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= W; w++) {
                value[w][i] = value[w][i-1]; // It basically means we are not adding any weight value.
                if (piecesWeight[i-1]<=w)
                {
                    int val = value[w-piecesWeight[i-1]][i-1]+piecesWeight[i-1];
                    value[w][i]= Math.max(value[w][i],val);
                }

            }
        }

        return value[W][piecesWeight.length];
    }

    static int optimalWeight(int W, int[] w) {
        return 0;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W, n;
        W = scanner.nextInt();
        n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        System.out.println(discreteKnapsackWithoutRepetion(W, w));
    }
}

