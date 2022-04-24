package harry.thread;

/**
 * 
 * @author harry
 *
 */
public class BThread extends Thread {
	private Boolean isTerminated = false;
	
	public Boolean getIsTerminated() {
		return isTerminated;
	}

	public void setIsTerminated(Boolean isTerminated) {
		this.isTerminated = isTerminated;
	}
	
	public BThread(String name){
		super(name);
	}
	
	public BThread(String name,Boolean isTerminated){
		super(name);
		this.isTerminated = isTerminated;
	}
	
	@Override
	public void run() {
		try {
			while(true){
				Thread.sleep(1);
				while(!getIsTerminated()){
					System.out.println(Thread.currentThread().getName());
					
					Thread.sleep(100);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
