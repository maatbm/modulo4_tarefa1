package Exercise_2;

import Exercise_2.entity.Cat;
import Exercise_2.entity.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Alfredo", "au au");
        Cat cat = new Cat("Maya", "miau miau");

        System.out.println(dog.getName());
        dog.makeSong();

        System.out.println(cat.getName());
        cat.makeSong();
    }
}
