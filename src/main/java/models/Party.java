package models;

public class Party {
   private Integer guests;
   private String food;
   private String drink;
   public Party(Integer guests, String food, String beverages, String entertainment) { //include food, beverages, entertainment for future use
      this.guests = guests;
      this.food = food;
      this.drink = drink;
    }
    public int getGuests() {
      return this.guests;
    }
    public String getFood() {
      return this.food;
    }
    public String getDrink() {
      return null;
    }

}
