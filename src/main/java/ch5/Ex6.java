package ch5;

public class Ex6 {

    public static void main(String[] args) {
        class Dog {
            void bark() {
                System.out.println("quiet");
            }

            void bark(char c, int i) {
                System.out.println("cawcaw");
            }

            void bark(int i, char c) {
                System.out.println("iyow");
            }
        }

        Dog d = new Dog();
        d.bark('c', 1);
        d.bark(1, 'c');
    }
}
