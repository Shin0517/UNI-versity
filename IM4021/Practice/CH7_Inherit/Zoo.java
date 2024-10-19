/*
建立一個動物類別層級，實作一個抽象類別 Animal，
這個類別有一個抽象方法 makeSound()。
實作兩個具體的子類別 Dog 和 Cat，並覆寫 makeSound() 方法來展示不同的動物叫聲。
建立一個 Zoo 類別來測試這些動物，並展示多態性的行為。
 */

package Practice.CH7_Inherit;

abstract class Animal{
    public abstract String makeSound();
}

class Dog extends Animal{
    @Override
    public String makeSound(){
        return "bark";
    }
}

class Cat extends Animal{
    @Override
    public String makeSound(){
        return "meow";
    }
}

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.makeSound());
        Cat cat = new Cat();
        System.out.println(cat.makeSound());
    }
    
}
