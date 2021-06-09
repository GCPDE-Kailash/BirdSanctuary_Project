import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.rmi.UnexpectedException;

public class BirdSanctuaryTest {
    @Test
    public void addMethod() {
        BirdSanctuaryManager birdSanctuaryManager = BirdSanctuaryManager.getInstance();
        Parrot parrot=new Parrot("p");
        Parrot parrot1=new Parrot("p1");
        Parrot parrot2=new Parrot("p2");
        Parrot parrot3=new Parrot("p3");
        birdSanctuaryManager.add(parrot);
        birdSanctuaryManager.add(parrot1);
        birdSanctuaryManager.add(parrot2);
        birdSanctuaryManager.add(parrot3);
        int result = birdSanctuaryManager.getAllCount();
        Assertions.assertEquals(4,result);
    }

    @Test
    public void ginvenNullShouldThrowException() {
        BirdSanctuaryManager birdSanctuaryManager = BirdSanctuaryManager.getInstance();
        Parrot parrot3=new Parrot("p3");
        Assertions.assertThrows(BirdSanctuaryException.class, ()-> {birdSanctuaryManager.remove(parrot3);
        });
    }
}