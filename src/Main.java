
public class Main {

	public static void main(String[] args) {

		AutoSys A1 = new AutoSys(1);
		Owner o1 = new Owner(1,A1);

		o1.Auto.channelUp();
		
	}

}
