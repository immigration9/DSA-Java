import java.util.ArrayList;

public class DFS {
	static boolean[] check;
	static ArrayList<SimpleLinkedList<Integer>> list;
	
	public static void dfs(int i) {
		check[i] = true;
		System.out.println(i);
		
		for (int j = 0; j < list.size(); j++) {
			int value = list.get(i).get(j);
			if (check[value] == false) {
				dfs(value);
			}
		}
	}
}
