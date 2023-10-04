package Tema2;

import java.io.*;
import java.util.Scanner;

public class MainApp
{


    public static void main(String[] args) throws IOException
    {
        String fis="src/Tema2/in.txt";
        BufferedReader flux_in;
        flux_in = new BufferedReader(new FileReader(fis));


        String linie ;
        int min=100,max=-100,s=0,nr=0;
        while ((linie = flux_in.readLine())!=null)
        {
            int a = Integer.parseInt(linie);
            System.out.println(a);

            s=s+a;
            nr++;
            if(a<min)
                min = a;
            if(a>max)
                max = a;
        }

        fis = "src/Tema2/out.txt";
        PrintStream flux_out = new PrintStream(fis);
        flux_out.println("Suma este: "+s);
        flux_out.println("Media aritmetica este: "+(float)(s/nr));
        flux_out.println("Maximul este: "+max);
        flux_out.println("Minimul este: "+min);
    }

}
