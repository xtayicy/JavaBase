import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Test;

import net.sf.cglib.proxy.Enhancer;
/**
 * 
 * @author harry
 *
 */
public class TestProxy {
	/**
	 * 
	 */
	@Test
	public void testDynamicProxy(){
		final Bird bird = new Bird();
		
		Fly proxy = (Fly) Proxy.newProxyInstance(bird.getClass().getClassLoader(), bird.getClass().getInterfaces(), new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("invoke before");
				return method.invoke(bird, args);
			}
		});
		
		proxy.fly();
	}
	
	/**
	 * 
	 */
	@Test
	public void testStaticProxy(){
		final Bird bird = new Bird();
		
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(bird.getClass());
		enhancer.setCallback(new net.sf.cglib.proxy.InvocationHandler() {
			@Override
			public Object invoke(Object target, Method method, Object[] args) throws Throwable {
				System.out.println("invoke before");
				return method.invoke(bird, args);
			}
		});
		Bird proxy = (Bird) enhancer.create();
		proxy.fly();
	}
}

interface Fly{
	public void fly();
}

class Bird /*implements Fly*/{
	public void fly() {
		System.out.println("I can fly!");
	}
}
