package gcalgorithm;

public class QuoteNumberAlgorithm {
	
	public Object instance = null;
	
	private static final int _1MB = 1024 * 1024;
	
	private byte[] bigSize = new byte[2 * _1MB];
	
	public static void testGC() {
		QuoteNumberAlgorithm objA = new QuoteNumberAlgorithm();
		QuoteNumberAlgorithm objB = new QuoteNumberAlgorithm();
		
		objA.instance = objB;
		objB.instance = objA;
		
		objA = null;
		objB =null;
		
		System.gc();
	}

}
