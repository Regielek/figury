package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String down;
        int x, y;
        char h = '*';
        boolean ABC = true;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("0. Wyjście z programu");
            System.out.println("1. Trójkąt");
            System.out.println("2. Kwadrat");
            System.out.println("3. Prostokąt");
            System.out.println("4. Trójkąt równoboczny");
            System.out.println("5. Okrąg - średnica - nie działa");

            System.out.print("Podaj opcję: ");

            down = in.nextLine();
            switch (down) {
                case "0":
                    System.out.println("Wyszedłeś z programu!");
                    ABC = false;
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
                    ABC = false;
                    break;

                case "2":
                    System.out.print("Podaj szerokość boków kwadratu: ");
                    x = in.nextInt();

                    for (int z = 0; z < x; z++)
                    {
                        System.out.print(h);
                    }

                    System.out.println();

                    for (int z = 0; z < x - 2; z++)
                    {
                        System.out.print(h);
                        for (int m = 0; m < x - 2; m++)
                        {
                            System.out.print(" ");
                        }
                        System.out.println(h);
                    }

                    for (int z = 0; z < x; z++)
                    {
                        System.out.print(h);
                    }
                    ABC = false;
                    break;

                case "3":
                    System.out.print("Podaj długość boku prostokąta: ");
                    x = in.nextInt();
                    System.out.print("Podaj szerokość boku prostokąta: ");
                    y = in.nextInt();

                    for (int z = 0; z < y; z++)
                    {
                        System.out.print(h);
                    }
                    System.out.println();

                    for (int z = 0; z < x - 2; z++)
                    {
                        System.out.print(h);
                        for (int m = 0; m < y - 2; m++)
                        {
                            System.out.print(" ");
                        }
                        System.out.println(h);
                    }

                    for (int z = 0; z < y; z++)
                    {
                        System.out.print(h);
                    }
                    ABC = false;
                    break;

                case "4":
                    System.out.print("Podaj wysokość trójkąta równobocznego: ");
                    x = in.nextInt();

                    for (int z = 1; z <= x; z++)
                    {
                        System.out.format("%" + ((x - z) + 1) + "s", " ");
                        for (int m = 1; m <= z + (z - 1); m++)
                        {
                            System.out.print(h);
                        }
                        System.out.println();
                    }
                    ABC = false;
                    break;

                case "5":
                    System.out.print("Podaj średnicę okręgu: ");
                    x = in.nextInt();

                    ABC = false;
                    break;

                default:
                    System.out.println("Nie ma takiej opcji!");
                    ABC = true;
            }
        } while (ABC);
    }
}