package Test;

import java.lang.annotation.Documented;
import java.util.ArrayList;
import java.util.List;

class Super
{
	public int field =0;
	public int getField() {return field;};
}

class Sub extends Super
{
public int field = 1;

public int getSuperField() {return super.field;};
}
public class Test1 {
//public static void main(String[] args) {
//	Super sup = new Sub();
//	System.out.println("sup.field="+sup.field+",sup.getField="+sup.getField());
//}
	
	public static void main(String[] args) {
//		List list = new ArrayList();
//		list.add(20);
//	
//		List<String> ls = list;
//		System.out.println(ls.get(0));
		
//		String str = "";
//		String regx = "^|\\d+.{1}\\d+,{1}\\d+.{1}\\d+|$";
		
		String str = "";
		String str1 = "";
		
		System.out.println(str == str1);
		
	}
}
