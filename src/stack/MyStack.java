package stack;

/*
 * javaʵ��ջ�ṹ,ֻ������ʵ��
 * @author WLNSSS
 * @time 2017.12.19
 * */
public class MyStack {
	
	//��ʼ��󳤶�Ϊ10
	private static int INIT_MAX_ARRAY_SIZE =10;
	private static int STACK_MIN_INDEX =0;
	
	//ʵ�ʴ洢������
	private int[] stack;
	
	//ջ�����ֵ
	private int size;
	
	//��ǰջ����λ��
	private int top;
	
	public MyStack() {
		this.init(INIT_MAX_ARRAY_SIZE);
	}
	
	public MyStack(int size) {
		this.init(size);
	}
	
	//��ʼ��ջ
	private void init(int size) {
		this.stack = new int[size];
		this.size = size;
		this.top = 0;
	}
	
	//��ջ����,������ջ�����
	public int push(int data) {
		
		if(is_full()) {
			throw new ArrayIndexOutOfBoundsException("ջ���");
		}
		
		stack[top] = data;
		top++;
		
		
		return top;
	}
	
	//��ջ���������س�ջԪ��
	public int pop() {
		
		if(is_empty()) {
			throw new ArrayIndexOutOfBoundsException("ջ����");
		}
		
		int returnData = stack[top-1];
		
		top--;
		
		return returnData;
		
	}
	
	//�ж�ջ�Ƿ�Ϊ��ջ
	private Boolean is_empty() {
		
		if(top == STACK_MIN_INDEX) {
			return true;
		}
		
		return false;
	}
	
	//�ж��Ƿ�Ϊ��ջ
	private Boolean is_full() {
		
		if(top == size) {
			return true;
		}
		
		return false;
	}
	
	//չʾջ�����е�����
	public void display() {
		for(int i = 0;i < top;i++) {
			System.out.println(stack[i]);
		}
	}
	
	public static void main(String[] args) {
		MyStack myStack = new MyStack(3);
		
		myStack.push(1);
		myStack.push(1);
		myStack.push(1);
		myStack.pop();
		myStack.push(1);
		myStack.pop();
		
		myStack.display();
	}

}
