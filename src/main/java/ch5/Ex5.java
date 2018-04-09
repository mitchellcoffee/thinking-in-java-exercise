package ch5;



public class Ex5 {

    public static void main(String[] args) {
        class Dog {
            void bark() {
                System.out.println("quiet");
            }

            void bark(char c) {
                System.out.println("cawcaw");
            }

            void bark(int i) {
                System.out.println("iyow");
            }
        }

        Dog d = new Dog();
        d.bark();
        d.bark('c');
        d.bark(100);

    }
}
