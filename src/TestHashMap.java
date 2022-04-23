import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class TestHashMap {
	public static final int COUNT = 5000;

	@Test
	public void test() {
		new TestHashMap();
	}

	public TestHashMap() {
		Map map = new HashMap();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < COUNT; i++) {
					map.put(new Integer(i), i);
				}

				System.out.println("t1 over!");
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < COUNT; i++) {
					map.put(new Integer(i), i);
				}

				System.out.println("t2 over!");
			}
		});

		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < COUNT; i++) {
					map.put(new Integer(i), i);
				}

				System.out.println("t3 over!");
			}
		});

		Thread t4 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < COUNT; i++) {
					map.put(new Integer(i), i);
				}

				System.out.println("t4 over!");
			}
		});

		Thread t5 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < COUNT; i++) {
					map.put(new Integer(i), i);
				}

				System.out.println("t5 over!");
			}
		});

		Thread t6 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < COUNT; i++) {
					map.get(new Integer(i));
				}

				System.out.println("t6 over!");
			}
		});

		Thread t7 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < COUNT; i++) {
					map.get(new Integer(i));
				}

				System.out.println("t7 over!");
			}
		});

		Thread t8 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < COUNT; i++) {
					map.get(new Integer(i));
				}

				System.out.println("t8 over!");
			}
		});

		Thread t9 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < COUNT; i++) {
					map.get(new Integer(i));
				}

				System.out.println("t9 over!");
			}
		});

		Thread t10 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < COUNT; i++) {
					map.get(new Integer(i));
				}

				System.out.println("t10 over!");
			}
		});

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
	}
}
