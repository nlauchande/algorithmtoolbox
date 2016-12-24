import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

/*
#stack
Status : DONE
*/

public class BalancedParanthesis {

    private static boolean isBalanced(String expression) {
        Deque<Character> listQueue = new ArrayDeque<Character>();

        char c;
        char e;
        for (int i = 0; i < expression.length(); i++) {

            c = expression.charAt(i);
            if ( c=='(' || c=='[' || c=='{')
            {
                listQueue.push(c);
            }
            {
                if (c==')' || c==']' || c=='}')
                {
                    if (listQueue.size()==0) {
                        return false;
                    }
                    e = listQueue.pop();

                    if (   (  c==')' && e!='(' )   ||
                            (  c==']' && e!='[' )  ||
                            (  c=='}' && e!='{' )

                            )
                    {
                        return false;
                    }
                }
            }

        }

        if (listQueue.size()!=0) {
            return false;
        }

        //write your code here
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exp = scanner.next();
        System.out.println(isBalanced(exp));
    }
}




