package Exercise_2.entity;

public class Animal {
    private final String name;
    private final String song;

    public Animal(String name, String song) {
        this.name = name;
        this.song = song;
    }

    public String getName() {
        return this.name;
    }

    public String getSong() {
        return this.song;
    }
}
