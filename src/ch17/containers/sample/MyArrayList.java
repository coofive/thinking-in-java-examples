package ch17.containers.sample;

import java.util.*;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2/23/2020 2:48 PM
 */
public class MyArrayList<E> extends AbstractList<E> {


    public static void main(String[] args) {
//        List<String> list =
//                Arrays.asList("A B C D E F G H I J K L".split(" "));
//        List<String> list2 =
//                Arrays.asList("A B C D E F G H I J K L".split(" "));
//        list.addAll(list2);
//        Collections.addAll();
//        List<String> strings = Collections.unmodifiableList(list);
        String[] arths = {"test","fsds"};
        System.out.println(arths.length);
        String[] strings = Arrays.copyOf(arths, arths.length);

        LinkedList<String> testLink = new LinkedList<>();
        testLink.add("test1");
        testLink.add("test2");
        testLink.add("test3");
        System.out.println("((LinkedList<String>) testLink).pollFirst() = " +  testLink.pollFirst());
        System.out.println("testLink = " + testLink);
        ListIterator<String> iterator = testLink.listIterator();
        ListIterator<String> iterator2 = testLink.listIterator();
        ListIterator<String> iterator3 = testLink.listIterator(1);
        System.out.println("iterator3.next() = " + iterator3.next());
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
            iterator2.next();
        }
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
