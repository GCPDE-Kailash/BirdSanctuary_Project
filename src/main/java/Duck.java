public class Duck extends Bird implements Flyable , Swimable {

    static int count = 0;

    public Duck(String id) {
        this.id = id;
        this.color = "White";
    }

    public void eat() {
        System.out.println("Duck is eating");
    }

    public void fly() {
        System.out.println("Duck is flying");
    }

    public void swim() {
        System.out.println("Duck is swimming");
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