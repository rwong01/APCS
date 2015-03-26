import static org.junit.Assert.*;

//import java.util.ArrayList;

import org.junit.Test;


public class lab5_10Test {

	@Test
	public void testSingleOperator() {
		assertEquals((1.0+1),lab5_10.evaluate(lab5_10.parse("1 + 1")),.00001);
		assertEquals((3.5-(-1.2)),lab5_10.evaluate(lab5_10.parse("3.5 - -1.2")),.00001);
		assertEquals((-42.49*25.94),lab5_10.evaluate(lab5_10.parse("-42.49 * 25.94")),.00001);
		assertEquals((3E-3/1.0001),lab5_10.evaluate(lab5_10.parse("3E-3 / 1.0001")),.00001);
	}
	
	@Test
	public void testMutipleOperators(){
		assertEquals((1.0/2*(-3)+5-9.13),lab5_10.evaluate(lab5_10.parse("1 / 2 * -3 + 5 - 9.13")),.00001);
		assertEquals((1+3.0/2*(-5)),lab5_10.evaluate(lab5_10.parse("1 + 3 / 2 * -5")),.00001);
		assertEquals((-13.298-64.2/14),lab5_10.evaluate(lab5_10.parse("-13.298 - 64.2 / 14")),.00001);
		assertEquals((34.13*9.3-14/5.5),lab5_10.evaluate(lab5_10.parse("34.13 * 9.3 - 14 / 5.5")),.00001);
	}
	
	@Test(expected=Exception.class)
	public void testExceptions() throws Exception{
		lab5_10.evaluate(lab5_10.parse("1.3+123"));
		lab5_10.evaluate(lab5_10.parse("This should throw an exception!"));
		lab5_10.evaluate(lab5_10.parse("4.5 * 9- 1931sej jaksd"));
	}
}
