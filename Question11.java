package JUnit.Assignment_Automation_2;

import static org.junit.Assert.*;

import org.junit.Test;

//   W.a.junit program to handled Assert class with all method to check its
 //   pass or fail

public class Question11 {
	@Test
	public void test() {
		assertEquals("bhumit", "Bhumit" );
        assertEquals("Bhumit", "Bhumit");
        assertTrue (true); 
		
		int a[] = {1,2,3,4,5};
		int b[] = {1,2,3,4,5};
		
		assertArrayEquals(a, b);
		
	}

	
		
	}	

