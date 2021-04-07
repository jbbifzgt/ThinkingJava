package stack;

/*
 * java实现栈结构,只用数组实现
 * @author WLNSSS
 * @time 2017.12.19
 * */
public class MyStack {
	
	//初始最大长度为10
	private static int INIT_MAX_ARRAY_SIZE =10;
	private static int STACK_MIN_INDEX =0;
	
	//实际存储的数组
	private int[] stack;
	
	//栈的最大值
	private int size;
	
	//当前栈顶的位置
	private int top;
	
	public MyStack() {
		this.init(INIT_MAX_ARRAY_SIZE);
	}
	
	public MyStack(int size) {
		this.init(size);
	}
	
	//初始化栈
	private void init(int size) {
		this.stack = new int[size];
		this.size = size;
		this.top = 0;
	}
	
	//入栈操作,返回入栈的序号
	public int push(int data) {
		
		if(is_full()) {
			throw new ArrayIndexOutOfBoundsException("栈溢出");
		}
		
		stack[top] = data;
		top++;
		
		
		return top;
	}
	
	//出栈操作，返回出栈元素
	public int pop() {
		
		if(is_empty()) {
			throw new ArrayIndexOutOfBoundsException("栈下溢");
		}
		
		int returnData = stack[top-1];
		
		top--;
		
		return returnData;
		
	}
	
	//判断栈是否为空栈
	private Boolean is_empty() {
		
		if(top == STACK_MIN_INDEX) {
			return true;
		}
		
		return false;
	}
	
	//判断是否为满栈
	private Boolean is_full() {
		
		if(top == size) {
			return true;
		}
		
		return false;
	}
	
	//展示栈中所有的数据
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
