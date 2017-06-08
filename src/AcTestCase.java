import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AcTestCase {
		Ac newAc;
	@Before
	public void setUp() throws Exception {
		newAc=new Ac();
	}

	@Test
	public void testChannel() {
	
		
		newAc.setTemp(25);
		assertEquals(25,newAc.getTemp());
	}

	@Test
	public void testChannelUp() {
	
		newAc.setTemp(25);
		newAc.tempUp();
		assertEquals(26,newAc.getTemp());
	}

	@Test
	public void testChannelDown() {

		
		newAc.setTemp(25);
		newAc.tempDown();
		assertEquals(24,newAc.getTemp());
	}

}
