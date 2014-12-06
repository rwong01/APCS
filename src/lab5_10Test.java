import static org.junit.Assert.*;

//import java.util.ArrayList;

import org.junit.Test;


public class lab5_10Test {

	@Test
	public void testSingleOperator() {
		assertEquals((1+1),lab5_10.evaluate(lab5_10.parse("1 + 1")),.00001);
		assertEquals((3.5-1.2),lab5_10.evaluate(lab5_10.parse("3.5 - 1.2")),.00001);
		assertEquals((42.49*25.94),lab5_10.evaluate(lab5_10.parse("42.49 * 25.94")),.00001);
		assertEquals((3E-3/1.0001),lab5_10.evaluate(lab5_10.parse("3E-3 / 1.0001")),.00001);
	}
	
	@Test
	public void testMutipleOperators(){
		assertEquals((1/2*3),lab5_10.evaluate(lab5_10.parse("1 / 2 * 3")),.00001);
	}
}
