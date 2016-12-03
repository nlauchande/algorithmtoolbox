import java.util.*;
import java.io.*;

/*
#divideandconquer
Status : TODO
*/

public class MajorityElement {

    private static int getMajorityElement(int[] a, int left, int right) {


        if ((left==right-1))
        {
            return a[left];
        }

        int leftMajority =  getMajorityElement(a,left,(left-right)/2);
        int rightMajority =  getMajorityElement(a,((left-right)/2)+1,right);

        if (leftMajority == rightMajority)
        {
            return leftMajority;
        }
        else
        {
            int leftMajorityCount =0  ;
            int rightMajorityCount = 0;
            for(int i = left ; i<right; i++ )
            {
                if (a[i]==leftMajority)
                {
                    leftMajorityCount++;
                }

                if (a[i]==rightMajority)
                {
                    rightMajorityCount++;
                }

            }
            if (Math.max(leftMajorityCount, rightMajorityCount) >= (left-right/2)+1 )
            {
                return Math.max(leftMajorityCount, rightMajorityCount);
            }
            else
            {
                return -1;
            }
        }

    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        if (getMajorityElement(a, 0, a.length) != -1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}

