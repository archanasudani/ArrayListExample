package loveProgramming;

import java.util.ArrayList;

public class Practice {

    public static void main(String args[]) {

        ArrayList<String> obj = new ArrayList<String>();

        Integer num = 2;
        obj.add("Archi");
        obj.add("Mani");
        obj.add("Sohi");
        obj.add("Raji");
        obj.add("Madhu");

        System.out.println("Original ArrayList:");
        for (String str : obj)
            System.out.println(str);
        obj.add(0, "Anish");
        obj.add(1, "Pardh");
        obj.add(2, "Gutti");
        obj.add(3, "Manu");
        obj.add(4, "Ron");

        System.out.println("\nArrayList after add operation:");
        for (String str : obj)
            System.out.println(str);
        obj.remove("Pardh");
        obj.remove("Gutti");
        obj.remove("Ron");

        System.out.println("\nArrayList after remove operation:");
        for (String str : obj)
            System.out.println(str);
//        obj.remove(1);
        obj.remove(3);
        System.out.println("\nFinal ArrayList:");
        for (String str : obj)
            System.out.println(str);
    }
}

