import java.util.Objects;

abstract public class Bird {
    String id;
    String color;
    abstract int getCount();
    abstract void incrementCount();
    abstract void decrementCount();
    abstract void eat();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return Objects.equals(id, bird.id);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "id='" + id + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}