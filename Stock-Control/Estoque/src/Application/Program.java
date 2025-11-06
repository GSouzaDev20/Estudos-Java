package Application;

import Entities.Product;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter Product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println("Product data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addQuantity(quantity);

        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeQuantity(quantity);

        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println();
    }
}
