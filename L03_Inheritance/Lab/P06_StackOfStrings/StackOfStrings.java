package Lab.P06_StackOfStrings;
/* @created by Ch.B. on 18-Mar-21 - 21:42 */

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {
    private List<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String item) {
        this.data.add(item);
    }

    public String pop() {
        if (isEmpty()) {
            return null;
        }

        return data.remove(data.size() - 1);
    }

    public String peek() {
        if (isEmpty()) {
            return null;
        }

        return data.get(data.size() - 1);
    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }
}
