package Queue;

/*
 * ����
 * @author WLNSSS
 * @time 2017.12.26
 * */
public class QueueTest {
	//ʵ�ʴ洢������
	private int array[]=null;
	
	//ͷָ���βָ��
	private int head;
	private int tail;
	
	//�ܴ洢����󳤶�
	private int maxLen;
	
	//������
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
	
	//���
	void add(int data)
	{
		//�����Ӳ������������
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
	
	//����
	void delete()
	{
		//������ǿ������
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
	
	//չʾ���������
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
