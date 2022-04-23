import org.junit.Test;

/**
 * 
 * @author harry
 *
 */
public class TestReturn {
	@Test
	public void test(){
		System.out.println(getIntValue());
	}
	
	public int getIntValue(){
		try {
			System.out.println("a");
			int a = 1 / 0;
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("b");
		}finally{
			System.out.println("c");
			return 2;
		}
	}
}
