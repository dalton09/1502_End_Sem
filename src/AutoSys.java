
public class AutoSys {

	public int id;
	public boolean pow=false;
	protected Tv T1 = new Tv();
	protected Ac Ac1 = new Ac();
	protected AudioSys As1 = new AudioSys();
	

	// tv conditioner functions//
	public void channelUp() {
		
		this.T1.channelUp();
		
	}
	
	public void channelDown() {
		
		this.T1.channelDown();
		
	}
	
	// air conditioner functions//
	public void tempUp()
	{
		this.Ac1.tempUp();
	}

	
	public void tempDown()
	{
		this.Ac1.tempDown();
	}
	
	// audio System functions//
	public void audVolUp()
	{
		this.As1.volumeUp();
		
	}
	
	
	public void audVolDown()
	{
		this.As1.volumeDown();
		
	}
	
	
	
	public AutoSys(int i) {
		this.id=i;
	}

	public AutoSys() {
		
	}
	
	    

	public void power(boolean p1)
	{
		this.pow=p1;
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

	
	public boolean getPower()
	{
		
			return this.pow;
		
	}



}
