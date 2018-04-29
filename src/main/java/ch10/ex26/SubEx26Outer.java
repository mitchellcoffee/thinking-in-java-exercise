package ch10.ex26;

public class SubEx26Outer {

    public class SubEx26Inner extends Ex26Outer.Ex26Inner {


        public SubEx26Inner(Ex26Outer x) {
            x.super("123");
            System.out.println("sub inner");
        }
    }

    public static void main(String[] args) {
        Ex26Outer outer = new Ex26Outer();
        SubEx26Outer subEx26Outer = new SubEx26Outer();
        SubEx26Inner subEx26Inner = subEx26Outer.new SubEx26Inner(outer);
    }
}
