package hashMap;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, String> hmap = new HashMap<String, String>();

        hmap.put("England", "London");
        hmap.put("Germany", "Berlin");
        hmap.put("Norway", "Oslo");
        hmap.put("USA", "Washington DC");
        hmap.put("John", "32");
        hmap.put("Steve", "30");
        hmap.put("Angie", "33");

        System.out.println(hmap);
    }
}
