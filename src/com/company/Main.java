package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String down;
        int x, y;
        char h = '*';

        Scanner in = new Scanner(System.in);

        System.out.println("0. Wyjście z programu");
        System.out.println("1. Trójkąt");
        System.out.println("2. Kwadrat");
        System.out.println("3. Prostokąt");

        System.out.print("Podaj opcję: ");

        down = in.nextLine();
        switch (down)
        {
            case "0":
                System.out.println("Wyszedłeś z programu!");
                break;

            case "1":
                System.out.print("Podaj wysokość trójkąta: ");
                x = in.nextInt();

                for (int z = 1; z <= x; z++)
                {
                    for (int m = 1; m <= z; m++)
                        System.out.print(h);
                        System.out.println();
                }
                break;

            case "2":
                System.out.print("Podaj szerokość boków kwadratu: ");
                x = in.nextInt();

                for (int z = 1; z <= x; z++)
                {
                    System.out.println();

                    for (int m = 1; m <= x; m++)
                    {
                        System.out.print(h);
                    }

                }
                break;

            case "3":
                System.out.print("Podaj długość boku prostokąta: ");
                x = in.nextInt();
                System.out.print("Podaj szerokość boku prostokąta: ");
                y = in.nextInt();

                for (int z = 1; z <= x; z++)
                {
                    System.out.println();

                    for (int m = 1; m <= y; m++)
                    {
                        System.out.print(h);
                    }
                }
                break;

            default:
                System.out.println("Nie ma takiej opcji!");
        }
    }
}
