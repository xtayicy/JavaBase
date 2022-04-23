package harry.thread;

/**
 * 
 * @author harry
 *
 */
public class AThread extends Thread {
	private Thread t;
	
	public AThread(String name,Thread t) {
		super(name);
		this.t = t;
	}

	@Override
	public void run() {
		synchronized(this){
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
}
