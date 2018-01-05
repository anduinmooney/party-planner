package models;

public class Party {
   private Integer guests;
   private String food;
   private String beverages;
   private String entertainment;
   private int price;
   public Party(Integer guests, String food, String beverages, String entertainment) { //include food, beverages, entertainment for future use
      this.guests = guests;
      this.food = food;
      this.beverages = beverages;
      this.entertainment = entertainment;
      this.price = this.guests * 5;
    }
    public int getGuests() {
      return this.guests;
    }
    public String getFood() {
      return this.food;
    }
    public String getDrink() {
      return this.beverages;
    }
    public String getEntertainment() {
      return this.entertainment;
    }
    public int getPrice() {
      return 0;
    }

}
