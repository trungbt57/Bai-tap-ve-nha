import static org.junit.Assert.*;


public class Test {

	@org.junit.Test
	public void test() {
		assertTrue(TestJUnitWorking.isPrime(2));
	}
	@org.junit.Test
	public void test1(){
		assertFalse(TestJUnitWorking.isPrime(4));
	}
	@org.junit.Test
	public void test2(){
		assertTrue(TestJUnitWorking.isPrime(3));
	}
	

}
