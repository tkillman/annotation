package annotation2;

import java.lang.reflect.Method;

public class Annotation2MainController {
	public static void main(String[] args) {
		
		HelloWorld helloWorld = new HelloWorld();
		
		try {
			Method method = helloWorld.getClass().getMethod("Hello");
			if (method.isAnnotationPresent(TestAnntation.class)) {
				TestAnntation testAnntation = method.getAnnotation(TestAnntation.class);
				System.out.println(testAnntation.message());
			}
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
