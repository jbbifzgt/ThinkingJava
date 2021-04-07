package emuntest;

public class EnumTest {

//	public void judge(SeasonEnum s) {
//
//		switch (s) {
//		case SPRING:
//			System.out.println("spring");
//			break;
//		case SUMMER:
//			System.out.println("summer");
//			break;
//		case FALL:
//			System.out.println("fall");
//			break;
//		case WINTER:
//			System.out.println("winter");
//			break;
//			default:;
//
//		}
//	}
	
	public static void main(String[] args) {
		
//		for(SeasonEnum s : SeasonEnum.values()) {
//			System.out.println(s);
//		}
//		
//		new EnumTest().judge(SeasonEnum.SPRING);
		
		
		SeasonEnum se = Enum.valueOf(SeasonEnum.class, "SPRING");
		se.name = "´çÍ·";
		System.out.println(se.name);
	}

}
