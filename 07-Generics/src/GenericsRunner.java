/**
 * Author: ldeepak
 */

public class GenericsRunner {
    public static void main(String[] args) {
        MyCustomList<String> list = new MyCustomList<>();
        list.addElement("Element1");
        list.addElement("Element2");
        list.get(0);

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(Integer.valueOf(1));
        list2.addElement(Integer.valueOf(2));
        list2.get(0);
    }
}