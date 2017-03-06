import java.util.*;

/*
#graph
Status : TODO
*/
public class ConnectedComponentConstruction {


    public void createConnections(int degree, ArrayList<Integer> vertexes,char[][] result )
    {
        int i = 0;
        while ( i < result.length)
        {
            for (int j=0; j<degree; j++)
            {
                for (int k = 0 ; k<degree; k++)
                {
                    if (j!=k)
                    {
                        if (i+k<vertexes.size() && i+j<vertexes.size() ) {
                            result[vertexes.get(i + j)][vertexes.get(i + k)] = 'Y';
                            result[vertexes.get(i + k)][vertexes.get(i + j)] = 'Y';
                        }
                    }
                }
            }
            i+=degree;
        }
    }

    public String[] construct(int[] s)
    {
        char[][] result = new char[s.length][s.length];

        for (int i =0 ; i < result.length; i++ )
        {
            for (int j =0 ; j < result.length; j++ )
            {
                result[i][j]='N';
            }
        }


        TreeMap<Integer,ArrayList<Integer>> mapOfVertexesPerDegree = new TreeMap<Integer,ArrayList<Integer>>();

        for (int i = 0; i <s.length; i++)
        {
            ArrayList<Integer> currentListOfVertexes;
            currentListOfVertexes = mapOfVertexesPerDegree.get(s[i]);

            if (currentListOfVertexes==null)
            {
                currentListOfVertexes = new ArrayList<Integer>();
            }

            currentListOfVertexes.add(i);
            mapOfVertexesPerDegree.put(s[i],currentListOfVertexes);
        }

        for(Map.Entry<Integer,ArrayList<Integer>> entry : mapOfVertexesPerDegree.entrySet()) {
            Integer degree = entry.getKey();
            ArrayList<Integer> currentListOfVertexes = entry.getValue();

            if (currentListOfVertexes.size() % degree == 0)
            {
                createConnections(degree, currentListOfVertexes, result);
            }
            else
            {
                return new String[] {};
            }

        }

        String[] finalResult = new String[result.length];

        for (int i =0 ; i < result.length; i++ )
        {
            finalResult[i] = new String(result[i]);

        }

        return finalResult;

    }


}
