package graph.traversal.algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BreadthFirstSearch {

	public static void bfs(List<List<Integer>> graph) {
		List<Integer> queue = new LinkedList<Integer>();
		queue.add(0);
		while (queue.size() != 0) {
			int node = queue.get(0);
			System.out.println(node);
			queue.remove(0);
			List<Integer> neighbours = graph.get(node);
			for (Integer neighbour : neighbours) {
				// if the graph has cycles we must check for visited nodes before adding them
				queue.add(neighbour);
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Hola Mundo!");
		
		List<List<Integer>> graph = new ArrayList<List<Integer>>();
		List<Integer> node1neighbours = new ArrayList<Integer>();
		node1neighbours.add(1); node1neighbours.add(2);
		List<Integer> node2neighbours = new ArrayList<>();
		node2neighbours.add(3);
		List<Integer> node3neighbours = new ArrayList<>();
		node3neighbours.add(4);
		List<Integer> node4neighbours = new ArrayList<>();
		node4neighbours.add(5); node4neighbours.add(6);
		List<Integer> node5neighbours = new ArrayList<>();
		List<Integer> node6neighbours = new ArrayList<>();
		List<Integer> node7neighbours = new ArrayList<>();
		graph.add(node1neighbours); graph.add(node2neighbours);
		graph.add(node3neighbours); graph.add(node4neighbours);
		graph.add(node5neighbours); graph.add(node6neighbours);
		graph.add(node7neighbours);
		
		System.out.println(graph);
		
		bfs(graph);
	}
}
