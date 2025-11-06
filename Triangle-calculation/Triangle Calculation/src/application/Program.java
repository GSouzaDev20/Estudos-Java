package application;


import entities.Triangle;

import java.util.Scanner;

public class Program {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("digite os lados do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("digite os lados do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.println("Área do triangulo X: " + areaX);
        System.out.println("Área do triangulo Y: " + areaY);

        if (areaX > areaY){
            System.out.println("Maior Área: X");
        }
        else{
            System.out.println("Maior Área: Y");
        }
    }




}
