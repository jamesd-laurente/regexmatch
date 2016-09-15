package regexmatch;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Regexmatch 
{
    public static Boolean isTrue(String str)
    {
        return str.matches(".*false.*");
    }

    public static void main(String[] args) throws FileNotFoundException 
    {
        System.out.println(isTrue("True"));
        System.out.println(containsFalse("jhflasehqsd"));
        Scanner sc = new Scanner(new FileReader("input.txt"));
    }

    private static boolean containsFalse(String _) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
