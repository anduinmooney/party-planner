package models;

public class Party {
   private Integer guests;
   private Integer food;
   private Integer beverages;
   private Integer entertainment;
   private int price;
   public Party(Integer guests, Integer food, Integer beverages, Integer entertainment) {
      this.guests = guests;
      this.food = food;
      this.beverages = beverages;
      this.entertainment = entertainment;
      this.price = this.guests * 5;
      this.price = this.food * 50;
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
      return 0;
    }

}
