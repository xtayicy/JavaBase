package harry.thread;

/**
 * 
 * @author harry
 *
 */
public class BThread extends Thread {
	private Thread t;
	
	public BThread(String name,Thread t) {
		super(name);
		this.t = t;
	}

	@Override
	public void run() {
		if(t != null){
			try {
				t.join();
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
