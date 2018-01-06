import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args) {
        boolean programRunning = true;
        while (programRunning) {

            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("You have reached Anduin's party planning company incorporated. Are you interested in planning a party? (Type: 'yes' or 'no')");
                String start = bufferedReader.readLine();
                if (start.equals("yes")) {
                    System.out.println("How many guests will attend your party? (Note: Price per person is $5)");
                    String guests = bufferedReader.readLine();
                    System.out.println("What kind of catering would you like for your party? (Type: 'pizza', 'burgers', 'tacos', or 'chinese' without any special characters)");
                    String food = bufferedReader.readLine();
                    System.out.println("What kind of beverages would you like for your party? (Type: 'soda', 'beer', 'wine', or 'juice' without any special characters)");
                    String beverages = bufferedReader.readLine();
                    System.out.println("What kind of entertainment would you like for your party? (Type: 'band', 'dj', 'clowns', or 'animalzoo' without any special characters)");
                    String entertainment = bufferedReader.readLine();
                    System.out.println("Do you have any coupons? If so, type in your desired coupon and we will check the coupon on arrival. (Type: 'food', 'drink', or 'entertainment' without any special characters)");
                    String coupons = bufferedReader.readLine();
                } else if (start.equals("no")) {
                    programRunning = false;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
