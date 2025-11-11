package Application;

import Util.Calculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dolar price? ");
        double Dolar = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double dolarQuantity = sc.nextDouble();

        System.out.println("Amount to be paid in Reais = " + Calculation.Conversor(Dolar, dolarQuantity));

    }
}