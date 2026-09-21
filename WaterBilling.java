import java.util.Scanner;
public class WaterBilling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking household details
        System.out.print("Enter household name: ");
        String name = sc.nextLine();

        System.out.print("Enter water usage in liters: ");
        double usage = sc.nextDouble();

        double bill;

        // Calculating water bill
        if (usage <= 5000) {
            bill = usage * 0.01;
        }
        else if (usage <= 10000) {
            bill = (5000 * 0.01) + ((usage - 5000) * 0.02);
        }
        else {
            bill = (5000 * 0.01)
                 + (5000 * 0.02)
                 + ((usage - 10000) * 0.03);
        }

        // Displaying bill
        System.out.println("Household Name: " + name);
        System.out.println("Water Usage: " + usage + " liters");
        System.out.println("Total Bill: Rs. " + bill);

        sc.close();
    }
}