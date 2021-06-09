import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BirdSanctuaryManager {

    public static final String filepath=" C:\\Users\\BABA\\BirdSanctuary_Project\\src\\main\\resources\\textFile.txt";

    Set<Bird> birdList = new HashSet<Bird>();
    private static BirdSanctuaryManager instance;

    public static BirdSanctuaryManager getInstance() {
        if (instance == null) {
            instance = new BirdSanctuaryManager();
        }
        return instance;
    }

    private BirdSanctuaryManager() {

    }

    public void add(Bird bird) {
        try {
            if (bird == null) {
                throw new BirdSanctuaryException("null not valid");
            }
            else {
                birdList.add(bird);
                bird.incrementCount();
            }
        }
        catch (BirdSanctuaryException e) {
            e.printStackTrace();
        }
    }

    public void remove(Bird bird) throws BirdSanctuaryException{
        if (birdList.contains(bird)) {
            birdList.remove(bird);
            bird.decrementCount();
        }else {
            throw new BirdSanctuaryException("bird is not present");
        }
    }

    public int getAllCount() {
        return birdList.size();
    }

    public void printFlyable() {
        birdList.stream().filter(bird -> bird instanceof Flyable)
                .forEach(bird -> ((Flyable) bird).fly());
    }

    public void printSwimable() {
        birdList.stream().filter(bird -> bird instanceof Swimable)
                .forEach(bird -> ((Swimable) bird).swim());
    }

    public void printEatable() {
        birdList.stream().forEach(bird -> (bird).eat());

    }

    public void saveBirdsToFile() throws Exception {
        StringBuffer stringBuffer = new StringBuffer();
        birdList.forEach(bird -> {
            String birdDataString = bird.toString().concat("\n");
            stringBuffer.append(birdDataString);
        });
        try {
            Files.write(Paths.get(filepath), stringBuffer.toString().getBytes(StandardCharsets.UTF_8));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printBird() {
        birdList.toString();
    }
}