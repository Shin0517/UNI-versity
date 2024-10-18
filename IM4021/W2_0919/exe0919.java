// Action Interface
interface Action {
    void makeSound();  // 產生動物的聲音
    void move();       // 描述動物的移動方式
}

class Animal implements Action {
    String name;
    String id;
    int age;

    public Animal(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " " + id + " " + age + " years eats.");
    }

    public void sleep() {
        System.out.println(name + " " + id + " " + age + " years sleeps.");
    }

    // Action 介面的 makeSound 和 move 方法將在子類別中實作
    @Override
    public void makeSound() {
        // 這裡會被子類別覆寫
    }
    @Override
    public void move() {
        // 這裡會被子類別覆寫
    }
}

// Dog 類別，繼承 Animal 類別
class Dog extends Animal {
    public Dog(String name, String id, int age) {
        super(name, id, age);  // 呼叫父類別的建構子
    }

    public void bark() {
        System.out.println(name + " " + id + " " + age + " years barks.");
    }

    // 覆寫 makeSound 方法
    @Override
    public void makeSound() {
        bark();  // 狗的叫聲
    }

    // 覆寫 move 方法
    @Override
    public void move() {
        System.out.println(name + " " + id + " " + age + " years runs.");
    }
}

// Bird 類別，繼承 Animal 類別
class Bird extends Animal {
    public Bird(String name, String id, int age) {
        super(name, id, age);  // 呼叫父類別的建構子
    }

    public void chirp() {
        System.out.println(name + " " + id + " " + age + " years chirps.");
    }

    public void fly() {
        System.out.println(name + " " + id + " " + age + " years flies.");
    }

    // 覆寫 makeSound 方法
    @Override
    public void makeSound() {
        chirp();  // 鳥的叫聲
    }

    // 覆寫 move 方法
    @Override
    public void move() {
        fly();  // 鳥的移動方式
    }
}

public class exe0919 {
    public static void main(String[] args) {
        Dog dog = new Dog("Haly", "id001", 5);
        Bird bird = new Bird("Cici", "id002", 2);

        dog.eat();
        dog.sleep();
        dog.makeSound(); 
        dog.move();      
        System.out.println();

        bird.eat();
        bird.sleep();
        bird.makeSound(); 
        bird.move();   
        System.out.println();
    }
}
