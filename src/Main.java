


import jdk.internal.jimage.BasicImageReader;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) throws IOException {

         FileWriter fileWriter = new FileWriter("Notes.txt");
         fileWriter.write("Aa,Bb,Cc,Dd,Ee,Ff,Gg,Hh,Ii,Jj,Kk,Ll," +
                 "Mm,Nn,Oo,Pp,Qq,Rr,Ss,Tt,Uu,Vv,Ww,Xx,Yy,Zz ");
         fileWriter.write("1,2,3,4,5,6,7,8,9");
         fileWriter.close();

         FileReader fl = new FileReader("Notes.txt");
         Scanner scanner = new Scanner(fl);
         while (scanner.hasNextLine()){
             System.out.print(scanner.nextLine());
         }
         BasicImageReader fileReader = null;
         fileReader.close();
             }
}
   /* public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Tom", 16));
        cats.add(new Cat("Jerry", 17));
        cats.add(new Cat("Iker", 37));
        for (Cat anyThing:cats ) {
            if (anyThing.getName().contains("Jerry")&& anyThing.getAge() == 17){
                System.out.println(anyThing );
            }
        }
    }*/
