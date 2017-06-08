
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

	public int printPower()
	{
		if(this.pow == true)
		{
			return 1;
		}
		
		else
		{
			
			return 0;
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

	public void setChannel(int chno)
	{
		this.channel=chno;
	}
}
