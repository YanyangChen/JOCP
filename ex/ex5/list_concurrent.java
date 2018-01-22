package ex5;
import java.util.*;
import java.util.concurrent.*;


public class list_concurrent {

}

class MyList {
    static ArrayList<Character> list = new ArrayList<>();
    public static void addItem() {
        list.add('a');
    }
    public static int[] iterateItem() {
        int counter = 0;
        int size1 = 0;
        int size2 = 0;
        for (char c : list) {
            if (counter == 0) {
                size1 = list.size();
            }
            if (counter == 9999) {
                size2 = list.size();
            }
            counter++;
        }
        return new int[] { counter, size1, size2 };
    }
}

class MyListcow {
    static CopyOnWriteArrayList<Character> list = new CopyOnWriteArrayList<Character>();
    public static void addItem() {
        list.add('a');
    }
    public static int[] iterateItem() {
        int counter = 0;
        int size1 = 0;
        int size2 = 0;
        for (char c : list) {
            if (counter == 0) {
                size1 = list.size();
            }
            if (counter == 9999) {
                size2 = list.size();
            }
            counter++;
        }
        return new int[] { counter, size1, size2 };
    }
}


class Worker implements Runnable {
    static Object obj1 = new Object ();
    Object obj2 = new Object ();
    public void run() {
        for (int i=0; i<10000;i++) {
            MyList.addItem();
        }
    }
}