public class base
 {
    public static void main(String[] args) {
        Dog objDog = new Dog();
        objDog.sound();
        Cat objCat = new Cat();
        objCat.sound();
        Animal objBase = new Animal();
        objBase.sound();
    }
}
class Dog extends Animal {
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}
class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}