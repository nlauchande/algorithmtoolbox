import java.util.Scanner;

/*
#greedy
Status : DONE
*/
public class Change {
    private static int getChange(int n) {
        //write your code here
        int resultMultiple10 = n/10;
        int current = n % 10;
        int resultMultiple5 = current/5;
        int resultMultiple1 = current%5;

        return (resultMultiple10+resultMultiple5+resultMultiple1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getChange(n));

    }
}

