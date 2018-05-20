package ch14.ex25;

import static net.mindview.util.Print.print;

class Secret implements A {
    public void e() { print("public Secret.e()"); }
	void f() { print("package Secret.f()"); }
	protected void g() { print("protected Secret.g()"); }
	private void h() { print("private Secret.h()"); }
}

public class SecretMaker {
	public static A makeSecret() {
		return new Secret();
	}
}
