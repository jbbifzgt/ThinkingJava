package Test;

public class ShellSortTest {
	
	void Sort(double arr[])
	{
		int addThing = arr.length/2;
		while(addThing >=1)
		{
			for(int i =addThing;i<arr.length;i++)
			{
				int flag=i;
				for(flag = i+addThing;flag<arr.length && arr[i-addThing]>arr[i];)
				{
					double temp = arr[i];
					arr[i]=arr[i-addThing];
					arr[i-addThing] = temp;
				}
			}
			addThing /=2;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShellSortTest ss = new ShellSortTest();
		double arr[] = new double[] {30,2,6,1,8,5};
		ss.Sort(arr);
		for(int i =0 ;i<arr.length;i++)
		{
			System.out.println("i:"+arr[i]);
		}

	}

}
