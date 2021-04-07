package Test;

public class InnerClassTest {
void f() {System.out.println("InnerClassTest.f()");}
public class Inner{
	public InnerClassTest nner()
	{
        f();
		return new InnerClassTest();
		
	}

	
}
public Inner inner()
{
	return new Inner();
}
public static void main(String[] args) {
	InnerClassTest ict = new InnerClassTest();
	InnerClassTest.Inner dti = ict.new Inner();
	dti.nner().f();;
}
}
