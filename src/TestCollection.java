import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * 
 * @author harry
 *
 */
public class TestCollection {
	@Test
	public void testRemove(){
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("a");
		list.add("b");
		System.out.println(list);
		list.remove("a");
		System.out.println(list);
	}
}
