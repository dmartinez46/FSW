import java.util.Scanner;

public class Measurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value you want to convert:");
        double value = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the unit you are converting from (inches, feet, cubits, steps, yards, miles):");
        String fromUnit = scanner.nextLine().toLowerCase();

        System.out.println("Enter the unit you are converting to (inches, feet, cubits, steps, yards, miles):");
        String toUnit = scanner.nextLine().toLowerCase();

        double valueInInches = 0;

        if (fromUnit.equals("inches")) {
            valueInInches = value;
        } else if (fromUnit.equals("feet")) {
            valueInInches = value * 12;
        } else if (fromUnit.equals("cubits")) {
            valueInInches = value * 18;
        } else if (fromUnit.equals("steps")) {
            valueInInches = value * 24;
        } else if (fromUnit.equals("yards")) {
            valueInInches = value * 36;
        } else if (fromUnit.equals("miles")) {
            valueInInches = value * 63360;
        } else {
            System.out.println("Invalid unit entered.");
            return;
        }

        double convertedValue = 0;
        if (toUnit.equals("inches")) {
            convertedValue = valueInInches;
        } else if (toUnit.equals("feet")) {
            convertedValue = valueInInches / 12;
        } else if (toUnit.equals("cubits")) {
            convertedValue = valueInInches / 18;
        } else if (toUnit.equals("steps")) {
            convertedValue = valueInInches / 24;
        } else if (toUnit.equals("yards")) {
            convertedValue = valueInInches / 36;
        } else if (toUnit.equals("miles")) {
            convertedValue = valueInInches / 63360;
        } else {
            System.out.println("Invalid unit entered.");
            return;
        }

        System.out.printf("%.2f %s is equal to %.2f %s.%n", value, fromUnit, convertedValue, toUnit);

        scanner.close();
    }
}
