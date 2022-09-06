package Q3;

public class Cal {

	public void compute() {
		int x = 2, y = 3;
		String s = "hello";

		log("Cal: compute()");
		int n = method1(x, y);
		int m = method2(s);
		log("method1(" + x + "," + y + ")" + "=" + n);
		log("method2(" + s + ")" + "=" + m);
	}

	int method1(int x, int y) {
		log("Cal: method1(" + x + "," + y + ")");
		return x + method3(y);
	}

	int method3(int y) {
		log("Cal: method3(" + y + ")");
		return 2*y;
	}

	int method2(String s) {
		log("Cal: method2(" + s + ")");
		return s.length()-2;
	}

	public void log(String message){
		System.out.println(message);
	}
}