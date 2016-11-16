package exam;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Reflectexam extends Thread {
	public void run() {
		try {
			Class<?> class1 = exam12.class;
			exam12 newExam1 = (exam12) class1.newInstance();
			Method method = class1.getMethod("count");
			method.invoke(newExam1);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException {

		Reflectexam reflect = new Reflectexam();
		reflect.start();

	}
	}
