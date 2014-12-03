import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class lab5_10Test {

	@Test
	public void testSingleOperator(){
		ArrayList<String> tokens= lab5_10.parse("1.0 * 1.0 / 2.5");
		assertEquals((1.0*1.0/2.5),lab5_10.evaluate(tokens),.01);
	}
}
