import java.util.ArrayList;

public class ArrayStack<T> {
	private ArrayList<T> stack;
	private int size;
	
	public ArrayStack(int size) {
		super();
		this.stack = new ArrayList<T>(size);
		this.size = 0;
	}

	public void push(T value) {
		if (!isFull()) {
			stack.add(value);
			size++;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public T pop() {
		if (!isEmpty()) {
			T cStack = peek();
			size--;
			return cStack;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public T peek() {
		if (!isEmpty()) {
			return stack.get(size - 1);
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public boolean isEmpty() {
		if (this.size > 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean isFull() {
		return (size == stack.size());
	}
}
