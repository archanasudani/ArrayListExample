package arrayList;

import java.util.ArrayList;

public class ArrayPetsAddAndRemove {

        public static void main(String args[]) {

            ArrayList<String> obj = new ArrayList<String>();

            Integer num = 2;
            obj.add("Cat");
            obj.add("Dog");
            obj.add("Monkey");
            obj.add("Fish");
            obj.add("Birds");

            System.out.println("Original ArrayList:");
            for (String str : obj)
                System.out.println(str);
            obj.add(0, "Snake");
            obj.add(1, "Mouse");


            System.out.println("\nArrayList after add operation:");
            for (String str : obj)
                System.out.println(str);
            obj.remove("Snake");

            System.out.println("\nArrayList after remove operation:");
            for (String str : obj)
                System.out.println(str);
//        obj.remove(1);
            obj.remove(1);
            System.out.println("\nFinal ArrayList:");
            for (String str : obj)
                System.out.println(str);
        }
    }



