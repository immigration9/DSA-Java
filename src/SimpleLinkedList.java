
public class SimpleLinkedList<T> {
	private Node<T> header;
	private int size;
	
	public SimpleLinkedList() {
		header = null;
		size = 0;
	}
	
	public int getSize() {
		return size;
	}

	public void addFirst(T data) {
		Node<T> newNode = new Node<T>(data);
		
		if (header == null) {
			header = newNode;
		} else {
			newNode.nextNode = header;
			header = newNode;
		}
		size++;
	}
	
	public void addLast(T data) {
		if (size == 0) {
			addFirst(data);
			return;
		} 
		Node<T> newNode = new Node<T>(data);
		Node<T> cNode = header;
		for (int i = 1; i < size; i++) {
			cNode = cNode.nextNode; 
		}
		cNode.nextNode = newNode; 
		size++;
	}
	
	public void add(T data, int index) {
		if (index == 0 || header == null) {
			addFirst(data);
			return;
		}
		if (index >= size) {
			addLast(data);
			return;
		}
		Node<T> newNode = new Node<T>(data);
		Node<T> cNode = header;
		for (int i = 1; i < index - 1; i++) {
			cNode = cNode.nextNode;
		}
		newNode.nextNode = cNode.nextNode;
		cNode.nextNode = newNode;
		size++;
	}
	
	public T removeNode(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index : " + index + ", Size : " + size);
		}
		Node beforeNode = header;
		Node deleteNode = header.nextNode;
		if (index == 0) {
			deleteNode = header;
			header = header.nextNode;
			return (T) deleteNode.data;
		}
		for (int i = 0; i < index; i++) {
			beforeNode = beforeNode.nextNode;
			deleteNode = deleteNode.nextNode;
		}
		beforeNode.nextNode = deleteNode.nextNode;
		size--;
		return (T) deleteNode.data;
	}
	
	public T get(int index) {
		return getNode(index).data;
	}
	
	private Node<T> getNode(int index) {
		if (index <= 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index : " + index + ", Size : " + size);
		}
		
		Node node = header;
		for (int i = 1; i < index - 1; i++) {
			node = header.nextNode;
		}
		
		return node;
	}
	
	@Override
	public String toString() {
		String out = "";
		Node<T> cNode = header;
		while (cNode.nextNode != null) {
			out = out.concat(cNode.data.toString());
			out = out.concat("  ");
			cNode = cNode.nextNode;
		}
		return out;
	}

	private class Node<T> {
		public T data;
		public Node<T> nextNode;
		
		public Node(T data) {
			this.data = data;
			this.nextNode = null;
		}

		@Override
		public String toString() {
			return data.toString();
		}
		
		
	}
	
}
