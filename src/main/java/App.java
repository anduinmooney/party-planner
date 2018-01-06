import models.Party;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;


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
                    String guestInput = (bufferedReader.readLine());
                    Integer guestAmount = Integer.parseInt(guestInput);
                    System.out.println("What kind of catering would you like for your party? (Type: '1' for pizza or '2' for burgers)");
                    String foodInput = (bufferedReader.readLine());
                    Integer foodType = Integer.parseInt(foodInput);
                    System.out.println("What kind of beverages would you like for your party? (Type: '1' for soda or '2' for beer)");
                    String beverageInput = (bufferedReader.readLine());
                    Integer beverageType = Integer.parseInt(beverageInput);
                    System.out.println("What kind of entertainment would you like for your party? (Type: '1' for band or '2' for an animal zoo without any special characters)");
                    String entertainmentInput = (bufferedReader.readLine());
                    Integer entertainmentType = Integer.parseInt(entertainmentInput);
                    System.out.println("Do you have any coupons? If so, type in your desired coupon and we will check the coupon on arrival. (Type: '1' for $50 off, '2' for $100 off, or '3' for $150 off. Limit one coupon per party.)");
                    String couponInput = (bufferedReader.readLine());
                    Integer couponType = Integer.parseInt(couponInput);

                    Party partyTotal = new Party(guestAmount, foodType, beverageType, entertainmentType, couponType);

                    System.out.println("Your total is $" + partyTotal.price + "!");
                    programRunning = false;



                } else if (start.equals("no")) {
                    programRunning = false;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
