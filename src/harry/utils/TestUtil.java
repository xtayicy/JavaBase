package harry.utils;

import org.junit.Test;

/**
 * 
 * @author harry
 *
 */
public class TestUtil {
	@Test
	public void testCopy(){
		//FileUtil.copy("test.txt", "copy.txt");
		FileUtil.copyNIO("test.txt", "copy.txt");
	}
	
	@Test
	public void testListFile(){
		//FileUtil.listFile("F://test");
		FileUtil.listFileNIO("F://test");
	}
}
