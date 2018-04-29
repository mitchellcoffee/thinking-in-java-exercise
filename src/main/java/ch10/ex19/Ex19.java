package ch10.ex19;

public class Ex19 {

    private class Ex19Inner {

        private class Ex19InnerInner {

        }
    }

    private static class Ex19Nested {

        private static class Ex19NestedNested {

        }
    }

    public static void main(String[] args) {
        Ex19Nested en = new Ex19Nested();
        Ex19Nested.Ex19NestedNested enn = new Ex19Nested.Ex19NestedNested();
        Ex19 ex19 = new Ex19();
        Ex19Inner inner = ex19.new Ex19Inner();
        Ex19Inner.Ex19InnerInner innerInner = inner.new Ex19InnerInner();
    }

}
