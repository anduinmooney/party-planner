package models;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.ArrayList;


public class PartyTest {
    @Test
    public void newParty_partyCreation() {
        Party testParty = new Party(50, 3, 3, 3);
        assertEquals(true, testParty instanceof Party);
    }
    @Test
    public void newParty_getGuests_returnGuest() {
        Party testParty = new Party(10, 3, 3, 3);
        assertEquals(10, testParty.getGuests());
    }
    @Test
    public void newParty_getFood_returnFood() {
        Party testParty = new Party(10, 3, 3, 3);
        assertEquals(3, testParty.getFood());
    }
    @Test
    public void newParty_getDrink_returnDrink() {
        Party testParty = new Party(10, 3, 3, 3);
        assertEquals(3, testParty.getDrink());
    }
    @Test
    public void newParty_getEntertainment_returnEntertainment() {
        Party testParty = new Party(10, 3, 3, 3);
        assertEquals(3, testParty.getEntertainment());
    }
    @Test
    public void newParty_getPrice_returnPrice() {
        Party testParty = new Party(10, 3, 3, 3);
        assertEquals(1025, testParty.getPrice());
    }

}