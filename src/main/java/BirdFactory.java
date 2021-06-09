public class BirdFactory {

    public Bird getBird(String birds, String birdName) {

        switch (birds) {
            case "parrot":
                return new Parrot(birdName);
            case "crow":
                return new Crow(birdName);
            case "penguin":
                return new Penguins(birdName);
            case "duck":
                return new Duck(birdName);
            default:
                return null;
        }
    }
}