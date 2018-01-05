package models;

public class Party {
   private Integer guests;
   public Party(Integer guests, String food, String beverages, String entertainment) { //include food, beverages, entertainment for future use
      this.guests = guests;
    }
    public int getGuests() {
      return this.guests;
    }

}
