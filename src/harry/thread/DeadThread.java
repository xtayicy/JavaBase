package harry.thread;

/**
 * 
 * @author Harry
 *
 */
public class DeadThread {
	public static void main(String[] args) throws InterruptedException {
		AThread aThread = new AThread("A",false);
		BThread bThread = new BThread("B",true);
		CThread cThread = new CThread("C",true);
		aThread.start();
		bThread.start();
		cThread.start();
		
		Thread.sleep(1000);
		aThread.setIsTerminated(true);
		bThread.setIsTerminated(false);
		
		Thread.sleep(1000);
		bThread.setIsTerminated(true);
		cThread.setIsTerminated(false);
	}
}
