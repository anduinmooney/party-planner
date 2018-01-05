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
    public void newParty_getGuests_returnTen() {
        Party testParty = new Party(10, "food", "beverages", "entertainment");
        assertEquals(10, testParty.getGuests());
    }
}