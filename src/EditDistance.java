import java.util.*;

/*
#dp
Status : TODO
*/
class EditDistance {

  static int  costOfDifference(char a , char b )
  {
    if ( a==b){
      return 0;
    }
    else
    {
      return 1;
    }
  }

  public static int EditDistance(String s, String t) {
    //write your code here
    s = " "+ s;
    t = " "+ t;
    int[][] distance = new int[s.length()][t.length()];
    for (int i = 0 ; i < distance[0].length; i++) distance[0][i] = i ;
    for (int j = 0 ; j < distance.length; j++) distance[j][0] = j ;

    for (int i = 1; i < distance.length; i++)
    {
      for ( int j = 1; j < distance[0].length; j++)
      {
        distance[i][j] =  Math.min(
                              Math.min( distance[i-1][j]+1,distance[i][j-1]+1),
                              distance[i-1][j-1]+costOfDifference(s.charAt(i), t.charAt(j) ) ) ;

      }
    }

    return distance[distance.length-1][distance[0].length-1];
  }

  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);

    String s = scan.next();
    String t = scan.next();

    System.out.println(EditDistance(s, t));
  }

}
