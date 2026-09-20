import java.util.ArrayList;
import java.util.Arrays;

public class StringList {
    private String[] elements;
    private int size;
    private int maxSize;

    public StringList (int initialCapacity){
        elements = new String[initialCapacity];
        size = 0;
        maxSize = 10;

    }
public StringList() {
        this(10);
}

public void add(String element) {
    ensureCapacity();
    elements[size] = element;
        size++;
}

public String get(int index) {
        return elements[index];
}

    private void ensureCapacity() {
        if (size == elements.length) {
        elements = Arrays.copyOf(elements, 2 * elements.length);
    }
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Kaampe fejl");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(get(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
