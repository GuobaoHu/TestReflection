package guyue.hu;
/**
 * @author guyue
 * @date 2017年11月20日 下午8:45:56
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
	//静态语句块，class 加载（load）之后，运行静态语句块
	static {
		System.out.println("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
	}
}

class D {
	
	//动态语句块
	{
		System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
	}
	//静态语句块，class 加载（load）之后，运行静态语句块,并且优先级较动态语句块高
	static {
		System.out.println("StaticSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
	}
}