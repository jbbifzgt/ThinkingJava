package innerclass;

interface A{
	void test();
}
public class ATest {
	
	public static void main(String[] args) {
		int age = 8;
		A a = new A() {
			
			@Override
			public void test() {
				// TODO Auto-generated method stub
				System.out.println(age);
			}
		};
		
		a.test();
		
		//�������潫�ᵼ�±������
		//age = 2;
	}

}
