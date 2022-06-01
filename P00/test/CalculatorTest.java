import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	private int a, b, c;
	Calculator cal;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

		cal = new Calculator();

		a = 150;
		b = 50;
		c = 0;

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		// fail("Not yet implemented");

		int actual = cal.add(a, b);
		int expected = 200;

		assertEquals(actual, expected);
	}

	@Test
	public void testSubtract() {
		// fail("Not yet implemented");

		int actual = cal.subtract(a, b);
		int expected = 100;

		assertEquals(actual, expected);
	}

	@Test
	public void testMultiple() {
		// fail("Not yet implemented");

		int actual = cal.multiple(a, b);
		int expected = 7500;

		assertEquals(actual, expected);
	}

	@Test
	public void testDivide() {
		// fail("Not yet implemented");

		int actual = cal.divide(a, b);
		int expected = 3;

		assertEquals(actual, expected);
	}
/*
	@Test
	public void testDivideByZero() {
		// fail("Not yet implemented");

		try {
			cal.divide(a, c);
			fail("Expected an IllegalArgumentExeception to be thrown");
		} catch (IllegalArgumentException e) {
			assertEquals("Denominator cannot be zero", e.getMessage());
		} catch (Throwable t) {
			assertEquals("Expected an IllegalArgumentExecption to be thrown", t.getMessage());
		}
	} */ 
}
