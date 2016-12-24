import java.util.*;

/*
#dp
Status : TODO
*/
class EditDistance {
  public static int EditDistance(String s, String t) {
    //write your code here

    int[][] distance = new int[s.length()][t.length()];
    for (int i = 0 ; i < distance[0].length; i++) distance[i][0] = 0 ;
    for (int j = 0 ; j < distance.length; j++) distance[0][j] = 0 ;

    for (int i = 1; i < distance.length; i++)
    {
      for ( int j = 0; j < distance.length; j++)
      {

      }
    }

    return 0;
  }
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);

    String s = scan.next();
    String t = scan.next();

    System.out.println(EditDistance(s, t));
  }

}
