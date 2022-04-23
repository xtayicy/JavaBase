package harry.interview.java;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;

/**
 * 
 * @author Harry
 *
 */
public class Pratice_1 {
	public void test(){
		class Teacher extends People{
			@Override
			public void doSth() {
				System.out.println("Teach student.");
			}
		}
		
		new Teacher(){
			public void doSth() {};
		};
	}
	
	public void test_1(){
		byte b = 1;
		switch(b){
		
		}
		
		String s = "s";
		switch(s){
		
		}
	}
	
	public void test_2(){
		char c = '中';
	}
	
	@Test
	public void test_3(){
		try{
			long l = 1;
			System.out.println(l / 0);
		}catch(Exception e){
			System.out.println("Long catched.");
		}
		
		try {
			float f = 1;
			System.out.println(f / 0);
		} catch (Exception e) {
			System.out.println("Float catched.");
		}
		
		try {
			double d = 1;
			System.out.println(d / 0);
		} catch (Exception e) {
			System.out.println("Double catched.");
		}
	}
	
	@Test
	public void test_4(){
		try {
			Map map = new HashMap();
			map.put(null, null);
			System.out.println(map);
		} catch (Exception e) {
			System.out.println("HashMap catched..");
		}
		
		try {
			Hashtable hashtable = new Hashtable();
			hashtable.put(null, null);
			System.out.println(hashtable);
		} catch (Exception e) {
			System.out.println("Hashtable catched.");
		}
	}
	
	@Test
	public void test_5(){
		AtomicInteger one = new AtomicInteger(1);
		int result = one.incrementAndGet();
		System.out.println(result);
	}
}

class People{
	public void doSth(){
		
	}
}
