import org.junit.Test;

/**
 * the program will print:
 * 				Caught B!
 * 				Caught A!
 * 				Finally!
 * because the root of exception is A.
 * @author harry
 *
 */
public class TestException {
	
	@Test
	public void test(){
		try {
			try {
				throw new A();
			} catch (B b) {
				System.out.println("Caught B!");
				throw b;
			}
		} catch (A a) {
			System.out.println("Caught A!");
			return;
		} finally {
			System.out.println("finally!");
		}
	}
}

/*class B extends Exception {

	*//**
	 * 
	 *//*
	private static final long serialVersionUID = 1L;
}

class A extends B {

	*//**
	 * 
	 *//*
	private static final long serialVersionUID = 1L;
}*/