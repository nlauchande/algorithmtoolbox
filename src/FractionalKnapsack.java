import java.util.*;

/*
#greedy #treemap
Status : DONE
*/

public class FractionalKnapsack {
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        //write your code here

        TreeMap<Integer,Double> hashMap = new TreeMap();

        for (int i = 0; i < values.length; i++) hashMap.put(i,(double) values[i]/weights[i]) ;

        SortedMap<Integer,Double> sortedMap = new TreeMap(
                new Comparator<Integer>()
                {
                    @Override
                    public int compare(Integer entryKey1,Integer entryKey2)
                    {

                        if ((hashMap.get(entryKey1) > hashMap.get(entryKey2)))
                        {
                            return -1;
                        }
                        else if ( (hashMap.get(entryKey1) < hashMap.get(entryKey2) ))
                        {
                            return 1;
                        }
                        else
                        {
                            return 0;
                        }

                    }
                }
        );

        sortedMap.putAll(hashMap);

        int capacityLeft = capacity;
        int index = 0;

        while (capacityLeft>0 && !sortedMap.isEmpty())
        {
            index = sortedMap.firstKey();

            if (weights[index] <= capacityLeft)
            {
                capacityLeft -= weights[index];
                value += values[index];
            }
            else
            {
                value += ( (double) capacityLeft/weights[index]) * ( values[index]);
                capacityLeft = 0;
            }
            sortedMap.remove(index);

        }


        return value;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
} 
