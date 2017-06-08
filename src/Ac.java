
public class Ac{

	public int temp;
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


	public Ac() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void tempUp()
	{
		this.temp=this.temp+1;
	}
	
	public void tempDown()
	{
		this.temp=this.temp-1;
	}
	
	public int getTemp()
	{
		return this.temp;
	}
	
	

}
