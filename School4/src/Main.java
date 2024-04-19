class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    String sound() {
        return name + " 울음소리";
    }
}

class Dog extends Animal {
    int age;
    Dog(String name, int age) {
        super(name);
        this.age = age;
    }
    Dog(String name) {
        this(name, 1);
    }
    public String toString() {
        return "이름: " + name + ", 나이: " + age + ", " + super.sound();
    }
}

class Main {
    public static void main(String[] args) {
        Dog Dog = new Dog(" ㅁㅁ", 5);
        Dog Dog2 = new Dog("ㅇㅇ");
        Animal Animal = new Animal("ㅂㅂ");
        System.out.println(Animal.sound());
        System.out.println(Dog.name);
        System.out.println(Dog);
        System.out.println(Dog2);
        Dog.sound();
    }
}
