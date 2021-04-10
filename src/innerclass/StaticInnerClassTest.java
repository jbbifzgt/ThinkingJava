package innerclass;

public class StaticInnerClassTest {
	
	private int prop1 = 5;
	private static int prop2 = 5;
	
	static class StaticInnerClass{
		private static int age;
		
		public void accessOuterProp() {
			System.out.println(prop1);
		}
	}

}
