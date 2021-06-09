public class Crow extends Bird implements Flyable {

    static int count = 0;

    public Crow(String id) {
        this.id = id;
        this.color = "black";
    }

    public void eat() {
        System.out.println("Duck is eating");
    }

    public void fly(){
        System.out.println("Duck is flying");
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