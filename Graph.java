//Max Potter
public class Graph
{
    public boolean[][] adjacencyMatrix;
    public Node[] degreeCount;
    
    public Graph(int numberOfNodes)
    {
        adjacencyMatrix = new boolean[numberOfNodes][numberOfNodes];
        for(boolean[] edgeStart : adjacencyMatrix)
        {
            for(int edgeEnd = 0; edgeEnd < numberOfNodes; edgeEnd++)
            {
                edgeStart[edgeEnd] = false;
            }
        }
        
        degreeCount = new Node[numberOfNodes];
        for(int nodeNumber = 0; nodeNumber < numberOfNodes; nodeNumber++)
        {
        	degreeCount[nodeNumber].nodeNumber = nodeNumber;
        	degreeCount[nodeNumber].degree = 0;
        }
    }
    
    public void addEdge(int edgeStart, int edgeEnd)
    {
    	//If this edge does not exist already...
    	if(!adjacencyMatrix[edgeStart][edgeEnd])
    	{
    		//Add the edge and update the degree counts.
        	adjacencyMatrix[edgeStart][edgeEnd] = true;
        	adjacencyMatrix[edgeEnd][edgeStart] = true;
        	degreeCount[edgeStart].degree++;
        	degreeCount[edgeEnd].degree++;
        }
    }
    
    public Node[] getNodes()
    {
    	return degreeCount;
    }
}
