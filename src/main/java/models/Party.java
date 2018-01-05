package models;

public class Party {
   private Integer guests;
   private Integer food;
   private Integer beverages;
   private Integer entertainment;
   private int price;
   private int guestPrice;
   private int foodPrice;
   private int beveragePrice;
   private int entertainmentPrice;



   public Party(Integer guests, Integer food, Integer beverages, Integer entertainment) {
      this.guests = guests;
      this.food = food;
      this.beverages = beverages;
      this.entertainment = entertainment;
      this.guestPrice = this.guests * 5;
      this.foodPrice = this.food * 50;
      this.beveragePrice = this.beverages * 25;
      this.entertainmentPrice = this.entertainment * 250;
      this.price = this.guestPrice + this.foodPrice + this.beveragePrice + this.entertainmentPrice;
      
    }
    public int getGuests() {
      return this.guests;
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

}
