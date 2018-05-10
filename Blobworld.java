

import java.util.Scanner;

/**
 * This class handles the problem solving of the Blobworld problem.
 * @author Seth Corbin
 */
public class Blobworld {

	private Graph graph;

	/**
	 * This class method was coded all by Seth Corbin.
	 * @author Seth Corbin
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		graph = new Graph(n);

		while(input.hasNextInt()) {

			int startNode = input.nextInt();
			int endNode = input.nextInt();

			graph.addEdge(startNode, endNode);

		}

		findSolution();

	}

	public void findSolution() {

		Node[] nodes = graph.getNodes();
		sortAscending(nodes);



	}

	public void sortAscending(Node[] arr) {
		for(int i = 1; i < arr.length; i++) {
			Node currentNode = arr[i];
			int j = i - 1;
			for(; j >= 0; j--) {
				if(arr[j] > currentNode)
					arr[j+1] = arr[j];
			}
			arr[j] = currentNode;
		}
	}
}