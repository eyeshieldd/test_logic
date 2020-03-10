package String;

import java.util.Arrays;
import java.util.Scanner;



public class k() {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
String text;
System.out.print("Masukan text: ");
text = in.nextLine();
char[] chars = text.toCharArray();
Arrays.sort(chars);
String urut = new String(chars);
System.out.print("hasil pengurutan: "+urut );
System.out.println()""
        
    }
}