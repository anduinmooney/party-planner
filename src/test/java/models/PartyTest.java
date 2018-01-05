package models;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.ArrayList;


public class PartyTest {
    @Test
    public void newParty_partyCreation() {
        Party testParty = new Party(50, "food", "beverages", "entertainment");
        assertEquals(true, testParty instanceof Party);
    }
    @Test
    public void newParty_getGuests_returnGuest() {
        Party testParty = new Party(10, "food", "beverages", "entertainment");
        assertEquals(10, testParty.getGuests());
    }
    @Test
    public void newParty_getFood_returnFood() {
        Party testParty = new Party(10, "food", "beverages", "entertainment");
        assertEquals("food", testParty.getFood());
    }
    @Test
    public void newParty_getDrink_returnDrink() {
        Party testParty = new Party(10, "food", "beverages", "entertainment");
        assertEquals("beverages", testParty.getDrink());
    }
}