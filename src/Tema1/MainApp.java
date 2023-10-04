package Tema1;

import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lungime = ");
        int L = scanner.nextInt();
        System.out.print("latime = ");
        int l = scanner.nextInt();

        int perimetru=2*L+2*l;
        System.out.println("Perimetrul este: "+perimetru);

        int aria=L*l;
        System.out.println("Aria este: "+aria);

        scanner.close();
    }
}
