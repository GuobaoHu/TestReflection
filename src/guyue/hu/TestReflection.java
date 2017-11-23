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
			
			Class<TT> ct = (Class<TT>) Class.forName("guyue.hu.TT");
			TT tt = ct.newInstance();
			Method m1 = null;
			Method m2 = null;
			try {
				m1 = ct.getMethod("setI", int.class);
				m2 = ct.getMethod("getI");
			} catch (NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
				System.exit(-1);
			}
			m1.invoke(tt, 12);
			int i = (int) m2.invoke(tt);
			System.out.println(i);
			
		/*	Method[] m1 = ct.getMethods();
			Method[] m2 = ct.getDeclaredMethods();
			for(Method m : m1) {
				System.out.println(m.getName());
				if(m.getName().equals("mTest")) {
					Object o = m.invoke(tt);
					
				}
			}*/
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
	
	public int getI() {
		return i;
	}
	
	public void mTest() {
		System.out.println("mTest 已被调用！");
	}
	
	public String getStr() {
		return str;
	}
}
