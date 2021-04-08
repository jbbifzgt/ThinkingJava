package gcalgorithm;

public class FinalizeEscapeGC {

	public static FinalizeEscapeGC SAVE_HOOK = null;

	public void isAlive() {
		System.out.println("i am alive");
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("finalize() is running");
		FinalizeEscapeGC.SAVE_HOOK = this;
	}

	public static void main(String[] args) throws InterruptedException {

		SAVE_HOOK = new FinalizeEscapeGC();

		SAVE_HOOK = null;
		System.gc();

		Thread.sleep(500);

		if (SAVE_HOOK != null) {
			SAVE_HOOK.isAlive();
		} else {
			System.out.println("i am dead");
		}

		// 下面代码和上面代码完全一样

		SAVE_HOOK = null;
		System.gc();

		Thread.sleep(500);

		if (SAVE_HOOK != null) {
			SAVE_HOOK.isAlive();
		} else {
			System.out.println("i am dead");
		}
	}

}
