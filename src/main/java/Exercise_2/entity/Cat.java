package Exercise_2.entity;

public class Cat extends Animal {
    public Cat(String name, String song) {
        super(name, song);
    }

    public void makeSong(){
        System.out.println(getSong());
    }
}

