package genericparadigm;

public class GenericParadigmTest {
	
	
	public <T> void f(T x) {
		System.out.println(x.getClass().getName());
	}
	
	public static void main(String[] args) {
		GenericParadigmTest gpt = new GenericParadigmTest();
		
		gpt.f("");
	}

}
