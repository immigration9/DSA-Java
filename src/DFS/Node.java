package DFS;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
	T data;
	boolean visited;
	List<Node<T>> neighbours;
	
	public Node(T data) {
		this.data = data;
		this.neighbours = new ArrayList<>();
	}
	
	public void addNeighbour(Node<T> neNode) {
		this.neighbours.add(neNode);
	}
	public List getNeighbours() {
		return neighbours;
	}
	public void setNeighbours(List neighbours) {
		this.neighbours = neighbours;
	}
}
