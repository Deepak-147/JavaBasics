import java.util.ArrayList;

/**
 * Author: ldeepak
 */
public class MyCustomList<T> {
    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element) {
        list.add(element);
    }

    public void removeElement(T element) {
        list.remove(element);
    }

    public T get(int idx) {
     return list.get(idx);
    }

}
