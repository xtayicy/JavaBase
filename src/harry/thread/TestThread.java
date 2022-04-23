package harry.thread;

import org.junit.Test;

/**
 * 
 * @author harry
 *
 */
public class TestThread {
	/**
	 * 实现线程顺序执行核心原理
	 * @throws InterruptedException
	 */
	@Test
	public void testJoin() throws InterruptedException{
		AThread aThread = new AThread("A",null);
		BThread bThread = new BThread("B",aThread);
		CThread cThread = new CThread("C",bThread);
		aThread.start();
		bThread.start();
		cThread.start();
		aThread.join();
		System.out.println("1");
		bThread.join();
		System.out.println("2");
		cThread.join();
		System.out.println("3");
	}
}
