

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import gmail.yoon.Calculator;

public class CalculatorTest {
	private Calculator cal;
	
	@Before
	public void setup(){
		 cal = new Calculator();
	
	}
	
	@Test
	public void add() {
		//add 테스트
		
		assertEquals(3, cal.add(1,2));
	}
	@Test
	public void divide() {
		//add 테스트
		assertEquals(3, cal.divide(9,3));
	}
	@Test
	public void multiplay() {
		//add 테스트
		assertEquals(2, cal.multiplay(1,2));
	}
	@Test
	public void subtract() {
		//add 테스트
		assertEquals(1, cal.subtract(2,1));
	}
	


}
