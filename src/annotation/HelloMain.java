package annotation;

import java.lang.reflect.Method;

public class HelloMain {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		Hello hello = new Hello();
		
		Method method = hello.getClass().getMethod("hello");
		
		if (method.isAnnotationPresent(Count100.class)) {
			
			for(int i = 0; i < 100; i++) {
				System.out.println(hello.hello() + i);
			}
		}
	}
}
