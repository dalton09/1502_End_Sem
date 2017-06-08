import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TvTestCase {
		Tv newTv;
	@Before
	public void setUp() throws Exception {
		newTv=new Tv();
	}

	@Test
	public void testChannel() {
	
		
		newTv.setChannel(50);
		assertEquals(50,newTv.getChannel());
	}

	@Test
	public void testChannelUp() {
	
		newTv.setChannel(50);
		newTv.channelUp();
		assertEquals(51,newTv.getChannel());
	}

	@Test
	public void testChannelDown() {

		
		newTv.setChannel(50);
		newTv.channelDown();
		assertEquals(49,newTv.getChannel());
	}

}
