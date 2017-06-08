
public class Tv {
	
	protected int channel=100;
	protected boolean pow=false;


	
	public void power(boolean p1)
	{
		this.pow=p1;
	}
	
	
	public boolean getPower()
	{
		
			return this.pow;
	}

	public void printPower()
	{
		if(this.pow == true)
		{
			System.out.println("On");
		}
		
		else
		{
			
			System.out.println("Off");
		}
	}

	
	
	
	
	
	public Tv() {
		// TODO Auto-generated constructor stub
	}
	
	public void channelUp()
	{
		this.channel=this.channel+1;
	}
	
	public void channelDown()
	{
		this.channel=this.channel-1;
	}
	
	public int getChannel()
	{
		return this.channel;
	}

}
