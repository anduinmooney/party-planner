package models;

public class Party {
   private Integer guests;
   private String food;
   public Party(Integer guests, String food, String beverages, String entertainment) { //include food, beverages, entertainment for future use
      this.guests = guests;
      this.food = food;
    }
    public int getGuests() {
      return this.guests;
    }
    public String getFood() {
   return null;
    }

}
