import org.junit.Test;

/**
 * 
 * @author harry
 *
 */
public class ReturnTest {
	@Test
	public void test(){
		System.out.println(getIntValue());
	}
	
	public int getIntValue(){
		try {
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			return 2;
		}
	}
}
