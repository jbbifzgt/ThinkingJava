package DLinkList;

public class DoublelinkList<T>  {
	
	public DoublelinkList() {
		// TODO Auto-generated constructor stub
		this.head = new Node<T>(null,null,null);
		this.tail=new Node<T>(null,null,null);
		this.tail.prev=head;
		this.head.next=tail;
		this.length =2;
		
	}
	
	public void clear()
	{
		this.head = new Node<T>(null,null,null);
		this.tail=new Node<T>(null,null,null);
		this.tail.prev=head;
		this.head.next=tail;
		this.length =2;
	}
	
	
	private T data;
	private Node<T> head;
	private Node<T> tail;
	private int length=0;
	
	//内部类 ，内置节点
	private class Node<T> {
		private T data ;
		private Node<T> prev;
		private Node<T> next;
		
		public Node(T data,Node<T> prev,Node<T>next)
		{
			this.data=data;
			this.prev=prev;
			this.next=next;
		}
		public Node(T data) {
			// TODO Auto-generated constructor stub
			this(data,null,null);
		}
		public Node() {
			// TODO Auto-generated constructor stub
			this(null,null,null);
		}
		
		public T display()
		{
			return data;
		}
		
		
	}
	
	
	
	
	
	public void addById(T data,int index)
	{
		
		if(index<=0||index>length-1)
		{
			System.out.println("index error");
		}
		else if(data==null)
		{
			System.out.println("data is null");
		}
		Node<T> flag = head;
		for(int i=0;i<index;i++)
		{
			flag=flag.next;
		}
		
		Node<T> temp = new Node<T>(data);
		flag.prev.next=temp;
		temp.prev=flag.prev;
		temp.next=flag;
		flag.prev=temp;

		length++;
		
		
	}
	
	public int add(T data)
	{
		addById(data,length-1);
		
		return length-1;
		
	}
	
	public void deleteById(int index)
	{
		Node<T> flag = head;
		for(int i=0;i<index;i++)
		{
			flag=flag.next;
		}
		
		flag.prev.next = flag.next;
		flag.next.prev = flag.prev;
		
		length--;
		
	}
	
	
	public void display()
	{
		Node<T> flag = head.next;
		for(int i=1 ;i<length-1;i++)
		{
			System.out.println(i+":"+flag.display());
			flag =flag.next;	
		}
	}
	
	public static void main(String[] args) {
		DoublelinkList<String> dl = new DoublelinkList<String>();
		dl.add("hello,java");
		dl.add("hello,php");
		dl.addById("hello,python",2);
		dl.deleteById(2);
		dl.display();
	}

}
