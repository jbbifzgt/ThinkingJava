package Test;

public class DrawThread extends Thread{
	private Account account;
	private double drawAmount;
	
	public DrawThread (String name , Account account , double drawAmount)
	{
		super(name);
		this.account=account;
		this.drawAmount=drawAmount;
	}
	public void run()
	{
		
		if(account.getBalance() >= drawAmount)
		{
			System.out.println(getName()+"取钱成功"+drawAmount);
			try
			{
				Thread.sleep(1);
			}
			catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			account.setBalance(account.getBalance()-drawAmount);
			System.out.println("\t 余额为" + account.getBalance());
		}
		else
		{
			System.out.println(getName()+"quqians");
		}
		
	}

}
