package guyue.hu;
/**
 * @author guyue
 * @date 2017��11��20�� ����8:45:56
 * @class describ:
 */
public class TestDynamicLoading {

	public static void main(String[] args) {
		new A();
		System.out.println("---------------------------------------");
		new B();
		new C();
		new C();
		new D();
		new D();
	}

}

class A {
	
}

class B {
	
}

class C {
	//��̬���飬class ���أ�load��֮�����о�̬����
	static {
		System.out.println("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
	}
}

class D {
	
	//��̬����
	{
		System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
	}
	//��̬���飬class ���أ�load��֮�����о�̬����,�������ȼ��϶�̬�����
	static {
		System.out.println("StaticSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
	}
}