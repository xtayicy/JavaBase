import org.junit.Test;

/**
 * 
 * @author harry
 *
 */
public class TestFibonacci {
	@Test
	public void test(){
		double sum = 0;
        int i = 1;
        while(true){
			sum += fibonacci(i++);
            if(sum >= 100000000){
            	System.out.println(i - 1);
            	break;
            }
        }
	}
	
	public static double fibonacci(int index) {
		int i = 1;
		int j = 2;

		if (index == 1) {
			return i;
		}

		if (index == 2) {
			return j;
		}

		return fibonacci(index - 1) + fibonacci(index - 2);
	}
}
