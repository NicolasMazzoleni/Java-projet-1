package hello;

public class HelloWorld {
    public static void main(String[] args) {
     Bonjour animal1, animal2;
     animal1 = new Human();
     animal2 = new Dog();
     System.out.println(animal1.sayHello());
     System.out.println(animal2.sayHello());
    }
}