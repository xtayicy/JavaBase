import org.junit.Test;

/**
 * 1.hashCode
 * @author harry
 *
 */
public class StringTest {
	@Test
	public void test(){
		String s1 = "java";
		String s2 = new String("java");
		System.out.println(s1 == s2);
		
		String s3 = "java";
		System.out.println(s3 == s1);
		
		String s5 = "hello";
		String s6 = "world";
		String s7 = "hello" + "world";
		//1.new StringBuilder().valueOf(s5).append(s6);  -> new String(str,0,count);
		String s8 = s5 + s6;
		System.out.println(s7 == s8);
		String s9 = "helloworld";
		System.out.println(s7 == s9);
	}
}
