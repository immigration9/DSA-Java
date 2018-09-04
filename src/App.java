
public class App {
	public static void main(String[] args) {
		SimpleLinkedList demoList = new SimpleLinkedList<Integer>();
		
		demoList.addLast(1);
		demoList.addLast(5);
		demoList.addLast(6);
		demoList.addLast(7);
		demoList.addLast(9);
		demoList.addFirst(25);
		demoList.addFirst(34);
		demoList.add(172, 2); 
		
		System.out.println(demoList.toString());
		
	}
}
