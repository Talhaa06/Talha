import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the voltage (Volts): ");
        double voltage = sc.nextDouble();

        System.out.print("Enter the current (Amperes): ");
        double current = sc.nextDouble();

        double power = voltage * current;

        System.out.println("Power Consumption: " + power + " Watts");

        sc.close();
    }
}
