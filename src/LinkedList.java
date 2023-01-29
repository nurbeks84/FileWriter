import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class LinkedList {
    public static void main(String[] args) {
//        List<String> strings = new java.util.LinkedList<>();
//        strings.add("Beknur");//B E K N U R
//        strings.add("Nurbolsun");// N U R B O L S U N
//        strings.add("Bektur"); //B E K T U R
//        strings.add("Nurbek");// N U R B E K
//
//        for (String string:strings) {
//            char[] ch =  string.toUpperCase().toCharArray();
//            for (char c : ch) {
//                System.out.print(c+" ");
//            }
//            System.out.println("\n");
//        }

        List<Integer> integers = new java.util.LinkedList<>();
        List<Integer> integers1 = new java.util.LinkedList<>();
        StringBuilder sas = new StringBuilder();
        integers.add(5);
        integers.add(7);
        integers.add(1);
        integers.add(2);
        //1257+1;1258
        Collections.sort(integers);
        for (int g:integers) {
        sas.append(g);
        }
        String n = String.valueOf(sas);
        int g = Integer.parseInt(n);
        int f = Integer.parseInt(String.valueOf(sas.reverse()));
        int k = g+f;
        System.out.println(g+"+"+f+"="+k);
        System.out.println(g+1);




    }
}
