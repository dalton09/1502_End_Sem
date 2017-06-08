import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AcTestCase.class, AutoSysTestCase.class, TvTestCase.class })
public class AllTests {

}
