import java.util.*;
import java.io.*;

/*
#adhoc #stream
Status : DONE
*/

public class MaxPairwiseProduct {

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        long maxIndex = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long current = 0;
        for (int i = 0; i < n; i++) {
            current = scanner.nextInt();
            if (current>maxIndex)
            {
                secondMax = maxIndex;
                maxIndex = current;
            }
            else if (current >secondMax) {
                secondMax = current;

            }
        }
        System.out.println((long) maxIndex*secondMax );
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