package Test;

public class SelectSort {
	
	public void sortTest(int arr[])
	{
	     for(int i=0;i<arr.length;i++)
	     {
	    	 int flag = i;
	    	 for(int x = i+1;x<arr.length;x++)
	    	 {
	    		 if(arr[flag]>arr[x])
	    		 {
	    			 flag=x;
	    		 }
	    		 
	    	 }
	    	 if(flag!=i)
	    	 {
	    		 int temp =arr[ flag];
	    		 arr[flag]=arr[i];
	    		 arr[i]=temp;
	    	 }
	     }
	}
	
	public static void main(String[] args) {
		int arr[]= {3,2,1,6,5};
		SelectSort ss = new SelectSort();
		ss.sortTest(arr);
		for(int i =0 ;i<arr.length;i++)
		{
			System.out.println("arr"+i+": "+arr[i]);
		}
	}

}
