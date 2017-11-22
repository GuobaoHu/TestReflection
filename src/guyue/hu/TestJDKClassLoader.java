package guyue.hu;
/**
*@author guyue E-mail:398456458@qq.com
*version1.0 创建时间:2017年11月22日 下午3:14:57
*describ 
*/
public class TestJDKClassLoader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println(String.class.getClassLoader());
		System.out.println(com.sun.crypto.provider.AESKeyGenerator.class.getClassLoader().getClass().getName());
		System.out.println(TestJDKClassLoader.class.getClassLoader().getClass().getName());*/
		ClassLoader c = TestJDKClassLoader.class.getClassLoader();
		while(c != null) {
			System.out.println(c.getClass().getName());
			c = c.getParent();
		}
		
		
	}

}
