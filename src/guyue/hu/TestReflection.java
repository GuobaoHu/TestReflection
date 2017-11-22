package guyue.hu;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author guyue
 * @date 2017年11月22日 下午8:47:52
 * @class describ:
 */
public class TestReflection {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("rawtypes")
			Class ct = Class.forName("guyue.hu.TT");
			ct.newInstance();
			Method[] m1 = ct.getMethods();
//			Method[] m2 = ct.getDeclaredMethods();
			for(Method m : m1) {
//				System.out.println(m.getName());
				if(m.getName().equals("getStr")) {
					Object o = m.invoke(ct.newInstance());
					System.out.println(o);
				}
			}
			System.out.println();
			/*for(Method m : m2) {
				System.out.println(m.getName());
			}*/
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}

class TT {
	private int i;
	private String str = "hello";
	static {
		System.out.println("T 已加载！");
	}
	
	public void setI(int i) {
		this.i = i;
	}
	
	public void mTest() {
		System.out.println("mTest 已被调用！");
	}
	
	public String getStr() {
		return str;
	}
}
