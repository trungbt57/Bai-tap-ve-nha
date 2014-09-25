import static org.junit.Assert.*;

import org.junit.Test;


public class TestClassNextDay {

	@Test
	public void test() {
		Date d =NextDay.nextDayOf(new Date(31,12,2014));
		Date d2 = new Date(1,1,2015);
		assertEquals(d2.getDay(), d.getDay());
		assertEquals(d2.getMonth(), d.getMonth());
		assertEquals(d2.getYear(), d.getYear());
	}
	@Test
	public void test1(){
		Date d =NextDay.nextDayOf(new Date(1,1,2014));
		Date d2 = new Date(2,1,2014);
		assertEquals(d2.getDay(), d.getDay());
		assertEquals(d2.getMonth(), d.getMonth());
		assertEquals(d2.getYear(), d.getYear());
	}
	@Test
	public void test2(){
		Date d =NextDay.nextDayOf(new Date(31,1,2014));
		Date d2 = new Date(1,2,2014);
		assertEquals(d2.getDay(), d.getDay());
		assertEquals(d2.getMonth(), d.getMonth());
		assertEquals(d2.getYear(), d.getYear());
	}

}
