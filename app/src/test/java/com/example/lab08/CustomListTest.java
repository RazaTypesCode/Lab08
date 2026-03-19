package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testCountCity() {
        CustomList list = new CustomList();
        City karachi = new City("Karachi", "Sindh");
        City lahore = new City("Lahore", "Punjab");
        City islamabad = new City("Islamabad", "ICT");
        list.addCity(karachi);
        assertTrue(list.countCity() == 1);
        list.addCity(lahore);
        assertTrue(list.countCity() == 2);
        list.addCity(islamabad);
        assertTrue(list.countCity() == 3);
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City karachi = new City("Karachi", "Sindh");
        City lahore = new City("Lahore", "Punjab");
        City islamabad = new City("Islamabad", "ICT");
        list.addCity(karachi);
        list.addCity(lahore);
        assertEquals(2, list.countCity());
        list.deleteCity(lahore);
        assertEquals(1, list.countCity());
        list.deleteCity(karachi);
        assertEquals(0, list.countCity());
    }
}