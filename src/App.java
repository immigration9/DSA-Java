import java.util.ArrayList;
import java.util.Scanner;

public class App {
	static int vertex;
	static int edge;
	
	public static void main(String[] args) {
//		SimpleLinkedList demoList = new SimpleLinkedList<Integer>();
		
//		demoList.addLast(1);
//		demoList.addLast(5);
//		demoList.addLast(6);
//		demoList.addLast(7);
//		demoList.addLast(9);
//		demoList.addFirst(34);
//		demoList.add(172, 2); 
//		demoList.addFirst(25);
		
//		System.out.println(demoList.toString());
		Scanner scan = new Scanner(System.in);
		
		vertex = scan.nextInt();
		edge = scan.nextInt();
		DFS.list = new ArrayList(vertex+1);
		DFS.check = new boolean[vertex+1];
		
		for (int i = 0; i < vertex + 1; i++) {
			DFS.list.add(new SimpleLinkedList<Integer>());
		}
		for (int i = 0; i < edge; i++) {
			int t1 = scan.nextInt();
			int t2 = scan.nextInt();
			
			DFS.list.get(t1).addFirst(t2);
			DFS.list.get(t2).addFirst(t1);
		}
		
		DFS.dfs(1);
	}
}
