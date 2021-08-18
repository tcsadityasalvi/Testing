package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator calculator;
	@BeforeEach
	void intit() {
		calculator = new Calculator();
		System.out.println("init");
		
	}

	@Test
	void testAdd() {
		Calculator calculator = new Calculator();
		int result = calculator.add(1, 3);
		assertEquals(4, result);
	}
	
	@Test
	void testAddFloatGreaterThan2() {
		float result = calculator.add1(3.0F, 3.1F);
		assertEquals(6.1, result);
	}
	
	
	@Test
	void testDivide1() {
		double result = calculator.divide(2,1);
		assertEquals(0.0, result);
	}
	
	
	@Test
	void testDivide() {
		Calculator calculator = new Calculator();
		 try {
			calculator.divide(1,0);
		} catch (Exception e) {
			assertNotNull(e);
			assertEquals(ArithmeticException.class, e.getClass());
		}
		
	}
	
	
	

}
