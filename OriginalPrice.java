import java.util.Scanner;

public class OriginalPrice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the discounted selling price: ");
        double discountedPrice = sc.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercent = sc.nextDouble();

        double originalPrice = (discountedPrice * 100) / (100 - discountPercent);

        System.out.println("Original Selling Price: " + originalPrice);

        sc.close();
    }
}

