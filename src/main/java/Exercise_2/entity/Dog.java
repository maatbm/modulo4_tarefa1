package Exercise_2.entity;

public class Dog extends Animal {
    public Dog(String name, String song) {
        super(name, song);
    }

    public void makeSong(){
        System.out.println(getSong());
    }
}
