import static org.junit.Assert.*;

import org.junit.Test;


public class TestClassWhatKindOfTriangle {

	@Test
	public void test() {
		//test 3 canh khong la canh cua 1 tam giac
		assertEquals("Khong phai la 3 canh cua 1 tam giac",WhatKindOfTriangle.checking(1, 1, 3));
	}
	@Test
	public void test1(){
		//test 3 canh cua 1 tam giac deu
		assertEquals("tam giac deu",WhatKindOfTriangle.checking(3,3,3));
	}
	@Test
	public void test2(){
		//test 3 canh cua 1 tam giac can
		//assertEquals("tam giac can",WhatKindOfTriangle.checking(2,2,3));
		//test 3 canh cua 1 tam giac vuong can
		assertEquals("tam giac vuong can",WhatKindOfTriangle.checking(3,3,Math.sqrt(18)) );
	}
	@Test
	public void test3(){
		//test 3 canh cua 1 tam giac vuong
		assertEquals("tam giac vuong",WhatKindOfTriangle.checking(3,4,5));
	}
	@Test 
	public void test4(){
		//test 3 canh chi la canh cua tam giac thuogn
		assertEquals("tam giac thuong",WhatKindOfTriangle.checking(1,2,3));
	}

}
