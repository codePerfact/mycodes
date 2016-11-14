import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.lang.String;
import java.io.*;


public class Main
{

    public static void main(String[] arg)
    {
        try
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            String s1 = br.readLine();
            int a=Integer.parseInt(s1);
            String s2 = br.readLine();
            int b=Integer.parseInt(s2);
            System.out.println(a+b);
        }catch(IOException e)
        {

        }
    }
}