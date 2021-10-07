import java.util.Random;
public class Tamagotchi {
    public String name;
    public int age;
    public Mood mood;
    public int energy;


    public Tamagotchi(String name, int age, Mood mood, int energy) {
        this.name = name;
        this.age = age;
        this.mood = mood;
        this.energy = energy;


    }

    @Override
    public String toString() {
        return "Tamagotchi{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mood=" + mood +
                ", energy=" + energy +
                '}';
    }
}
