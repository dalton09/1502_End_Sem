
public class AudioSys{

	private int volume = 20;
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


	public AudioSys() {
		// TODO Auto-generated constructor stub
	}

	public void volumeUp() {
		// TODO Auto-generated method stub
		this.volume=this.volume+1;
	}

	
	public void volumeDown() {
		// TODO Auto-generated method stub
		this.volume=this.volume-1;
	}
}
