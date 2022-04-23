/**
 * the program will print:
 * 				Caught B!
 * 				Caught A!
 * 				Finally!
 * because the root of exception is A.
 * @author harry
 *
 */
public class ExceptionTest {
	public static void main(String[] args) throws Exception {
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

class B extends Exception {
}

class A extends B {
}