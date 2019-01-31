package hashSet;

import java.util.HashSet;
import java.util.Iterator;

class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<String>();
        hset.add("Rama");
        hset.add("Rag");
        hset.add("Maggi");
        hset.add("Gang");
        hset.add("Ron");
        hset.add("Rose");
        hset.add(null);
        hset.add("Maggi");
        System.out.println(hset);
//        Iterator<String> i = hset.iterator();
//        While(i.hasNext());
//        {
//            System.out.println(i.next());
//        }
    }

    private static void While(boolean hasNext) {
    }
}
