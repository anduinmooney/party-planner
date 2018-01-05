package models;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.ArrayList;


public class PartyTest {
    @Test
    public void newParty_partyCreation() {
        Party testEvent = new Party(50, "food", "beverages", "entertainment");
        assertEquals(true, testEvent instanceof Party);
    }
}