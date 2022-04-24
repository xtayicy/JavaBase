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
		AThread aThread = new AThread("A");
		BThread bThread = new BThread("B");
		CThread cThread = new CThread("C");
		aThread.start();
		aThread.join();
		bThread.start();
		bThread.join();
		cThread.start();
	}
}
