package Q3b;

public class Cal {

	private Debug db = new DebugToScreen();

	public void compute() {
		int x = 2, y = 3;
		String s = "hello";

		db.log("Cal: compute()");
		int n = method1(x, y);
		int m = method2(s);
		db.log("method1(" + x + "," + y + ")" + "=" + n);
		db.log("method2(" + s + ")" + "=" + m);
	}

	int method1(int x, int y) {
		db.log("Cal: method1(" + x + "," + y + ")");
		return x + method3(y);
	}

	int method3(int y) {
		db.log("Cal: method3(" + y + ")");
		return 2*y;
	}

	int method2(String s) {
		db.log("Cal: method2(" + s + ")");
		return s.length()-2;
	}

	public void log(String message){
		System.out.println(message);
	}
}