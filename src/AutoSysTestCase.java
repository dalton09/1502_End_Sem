import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AutoSysTestCase {
		AutoSys newAuto;
		Tv t1;
	@Before
	public void setUp() throws Exception {
		newAuto=new AutoSys();
		t1 = new Tv();
	}

	@Test
	public void testTvOn() {
	
		
		newAuto.tvOn();
		assertEquals(1,newAuto.printTvPower());
	}

	@Test
	public void testTvOff() {
	
		
		newAuto.tvOff();
		assertEquals(0,newAuto.printTvPower());
	}




}
