public class Snake extends Tamagotchi {
    public int length;


    public Snake(String name, int age, Mood mood, int energy, int length) {
        super(name, age, mood, energy);
        this.length = length;
    }

    @Override
    public String toString() {
        return "Snake{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mood=" + mood +
                ", energy=" + energy +
                '}';
    }

    @Override
    public void burp() {
        ////Overrides the super method to match the snake
        System.out.println("SSSSsssssssBURPssssssss");
    }
}
