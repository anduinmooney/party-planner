package models;

public class Party {
   private Integer guests;
   private Integer food;
   private Integer beverages;
   private Integer entertainment;
   private Integer coupon;
   public int price;
   private int guestPrice;
   private int foodPrice;
   private int beveragePrice;
   private int entertainmentPrice;
   private int couponPrice;



   public Party(Integer guestAmount, Integer foodType, Integer beverageType, Integer entertainmentType, Integer couponAmount) {
      guests = guestAmount;
      food = foodType;
      beverages = beverageType;
      entertainment = entertainmentType;
      coupon = couponAmount;
      guestPrice = guestAmount * 5;
      foodPrice = foodType * 50;
      beveragePrice = beverageType * 25;
      entertainmentPrice = entertainmentType * 250;
      couponPrice = couponAmount * 50;
      price = this.guestPrice + this.foodPrice + this.beveragePrice + this.entertainmentPrice - this.couponPrice;

    }
    public int getGuests() {
      return guests;
    }
    public int getFood() {
      return this.food;
    }
    public int getDrink() {
      return this.beverages;
    }
    public int getEntertainment() {
      return this.entertainment;
    }
    public int getPrice() {
      return this.price;
    }
    public int getCoupon() {
      return 0;
   }

}
