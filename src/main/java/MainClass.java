public class MainClass {

    public static void main(String args[]) throws Exception {

        System.out.println("welcome to BirdSanctuaryManager");
        BirdSanctuaryManager birdSanctuaryManager = BirdSanctuaryManager.getInstance();

        BirdFactory birdFactory = new BirdFactory();
        Bird parrot = birdFactory.getBird("parrot", "parrot");
        Bird crow = birdFactory.getBird("crow", "crow");
        Bird penguins = birdFactory.getBird("penguin", "penguin");
        Bird duck = birdFactory.getBird("duck", "duck");

        BirdSanctuaryManager.getInstance().add(parrot);
        BirdSanctuaryManager.getInstance().add(crow);
        BirdSanctuaryManager.getInstance().add(penguins);
        BirdSanctuaryManager.getInstance().add(duck);

        birdSanctuaryManager.printSwimable();
        birdSanctuaryManager.printFlyable();
        birdSanctuaryManager.printEatable();

        BirdSanctuaryManager.getInstance().printEatable();
        BirdSanctuaryManager.getInstance().printFlyable();
        BirdSanctuaryManager.getInstance().printSwimable();

        System.out.println("Number of Parrots are: " + parrot.getCount());
        System.out.println("Number of Penguins are: " + penguins.getCount());
        System.out.println("Number of Ducks are: " + duck.getCount());
        System.out.println("Number of Crows are: " + crow.getCount());
        System.out.println("Total Birds = " + BirdSanctuaryManager.getInstance().getAllCount());

        BirdSanctuaryManager.getInstance().remove(duck);
        BirdSanctuaryManager.getInstance().remove(crow);

        System.out.println("Number of Parrots are: " + parrot.getCount());
        System.out.println("Number of Penguins are: " + penguins.getCount());
        System.out.println("Number of Ducks are: " + duck.getCount());
        System.out.println("Number of Crows are: " + crow.getCount());
        System.out.println("Total Birds = " + BirdSanctuaryManager.getInstance().getAllCount());

        BirdSanctuaryManager.getInstance().printBird();
        BirdSanctuaryManager.getInstance().saveBirdsToFile();

    }
}