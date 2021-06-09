public class Parrot extends Bird implements Flyable {

    static int count = 0;

    public Parrot(String id) {
        this.id = id;
        this.color = "green";
    }

    public void eat() {
        System.out.println("Parrot is eating");
    }

    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    int getCount() {
        return count;
    }

    @Override
    void incrementCount() {
        count++;
    }

    @Override
    void decrementCount() {
        count--;
    }
}