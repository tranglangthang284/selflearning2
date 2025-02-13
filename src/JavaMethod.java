import java.util.Scanner;

public class JavaMethod {
    static int[] prices = {15000, 10000, 7000, 2000};

    public static void main(String[] args) {
        e01();
    }

    static void e01() {
        Scanner s = new Scanner(System.in);
        int totalPrice = 0;

        while (true) {
            System.out.print("1. pizza(15,000) 2. spaghetti(10,000) 3. salad(7,000) 4. drink(2,000) 5. exit > ");

            int choice = s.nextInt();
            if (choice == 5) {
                System.out.println("Menu selection ended");
                break;
            } else if (choice >= 1 && choice <= 4) {
                totalPrice = totalPrice + prices[choice - 1];
                System.out.println("Total price from now on is " + totalPrice);
            }

        }

    }
}
