package innerclass;

interface Product{
	public double getPrice();
	public String getName();
}
public class AnnotmousTest {
	
	public void test(Product p) {
		System.out.println("buy a :" + p.getName() +" cost " + p.getPrice());
	}
	
	public static void main(String[] args) {
		AnnotmousTest ta = new AnnotmousTest();
		
		ta.test(new Product() {
			
			@Override
			public double getPrice() {
				// TODO Auto-generated method stub
				return 567;
			}
			
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return "hahaa";
			}
		});
	}

}
