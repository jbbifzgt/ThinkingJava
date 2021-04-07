package Queue;

/*
 * 队列
 * @author WLNSSS
 * @time 2017.12.26
 * */
public class QueueTest {
	//实际存储的数组
	private int array[]=null;
	
	//头指针和尾指针
	private int head;
	private int tail;
	
	//能存储的最大长度
	private int maxLen;
	
	//构造器
	public QueueTest() {
		// TODO Auto-generated constructor stub
		this(10);
	}
	
	public QueueTest(int len)
	{
		array=new int[len];
		head=0;
		tail=0;
		maxLen=array.length;
	}
	
	//入队
	void add(int data)
	{
		//如果入队不是满的则入队
		if(isFull())
		{
		System.out.println("Queue full");
		}
		else
		{
			array[tail]=data;
			tail=(tail+1)%maxLen;
			
		}
			
	}
	
	//出队
	void delete()
	{
		//如果不是空则出队
		if(isNull())
		{
			System.out.println("isNull");
		}
		else
		{
			
			array[head]=0;
			head=(head+1)%maxLen;
			
		}
	}
	
	//展示队里的内容
	void display()
	{
		
		for(int i=0;i<3;i++)
		{
			
			System.out.println(array[i]+"head:"+head+"tail"+tail);
		}
	}
	
	Boolean isFull()
	{
		if((tail+1)%maxLen ==head)
		{
			return true;
		}
		
		return false;
		
	}
	
	Boolean isNull()
	{
		if(head==tail)
		{
			return true;
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		QueueTest qt = new QueueTest(3);
		qt.add(5);
		qt.add(10);
		qt.delete();
		qt.add(10);
		qt.add(10);
		qt.delete();
		qt.add(3);
		qt.add(2);
		qt.delete();
		qt.add(2);

		qt.display();
		
		System.exit(0);
	}
	
	

}
