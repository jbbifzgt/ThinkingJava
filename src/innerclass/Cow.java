package innerclass;

public class Cow {
	private double weight;
	
	public Cow() {}
	
	public Cow(double weight) {
		this.weight = weight;
	}
	
	private class CowLeg{
		private double length;
		private String color;
		
		public CowLeg() {}
		
		public CowLeg(double length,String color) {
			this.length = length;
			this.color = color;
		}
		
		public void info() {
			System.out.println("color:"+color+" length:"+length+" weight:"+weight);
		}
		
		
		
	}
	public void test() {
		CowLeg cl = new CowLeg(1.12,"black and white");
		cl.info();
	}
	public static void main(String[] args) {
		Cow cow = new Cow(378.9);
		cow.test();
	}

}
