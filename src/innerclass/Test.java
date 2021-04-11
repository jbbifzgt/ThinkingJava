package innerclass;

public class Test {
	
	public static void main(String[] args) {
	
		//ordinary example
//		Runnable r = () ->{
//			
//			System.out.println("hahaa");
//				
//			};
		
		//false example
		Object obj = (Runnable) () -> System.out.println("hahah");
		
		
		}
	}
