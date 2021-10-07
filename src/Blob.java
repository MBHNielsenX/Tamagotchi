public class Blob extends Tamagotchi{
    public int size;

    public Blob(String name, int age, Mood mood, int energy, int size) {
        super(name, age, mood, energy);
        this.size = size;
    }


    @Override
    public String toString() {
        return "Blob{" +
                "size=" + size +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mood=" + mood +
                ", energy=" + energy +
                '}';
    }
}






