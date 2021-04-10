package innerclass;

interface Eatable {
	void taste();
}

interface Flyable {
	void fly(String weather);
}

interface Addable {
	int add(int a, int b);
}

public class LambdaTest {

	public void eat(Eatable e) {
		System.out.println(e);
		e.taste();
	}

	public void drive(Flyable f) {
		System.out.println("I drive " + f);
		f.fly("ºÃÌìÆø");
	}

	public void test(Addable add) {
		System.out.println("The sum of five add three is " + add.add(5, 3));
	}

	public static void main(String[] args) {
		LambdaTest lt = new LambdaTest();
		
		
		lt.eat(() -> System.out.println("hahaha"));
		
		lt.drive(weather ->{
			System.out.println("the wheather is " + weather);
		});
		
		lt.test((a,b) -> a + b);
		
		
	}

}
