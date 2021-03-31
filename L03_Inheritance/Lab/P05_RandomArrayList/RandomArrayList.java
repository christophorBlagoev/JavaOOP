package Lab.P05_RandomArrayList;
/* @created by Ch.B. on 18-Mar-21 - 21:32 */

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RandomArrayList < T > extends ArrayList<T> {

    public T getRandomElement() {
        int index = ThreadLocalRandom.current().nextInt(this.size());
        return remove(index);
    }
}
