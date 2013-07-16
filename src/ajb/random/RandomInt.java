package ajb.random;

import java.util.Random;

public class RandomInt {

    /**
     * Returns a random {@link int}
     * 
     * @return {@link int}
     */
    public static int anyRandomInt() {
        Random random = new Random();
        return random.nextInt();
    }

    /**
     * Returns a random {@link int} between the two passed in values
     * 
     * @param low {@link int}
     * @param high {@link int}
     * @return {@link int}
     */
    public static int anyRandomIntRange(int low, int high) {
    	return low + (int) (Math.random() * ((high - low) + 1));
    }
}
