package org.example;

import java.util.ArrayList;
import java.util.List;

public interface PetStore {
    public List<String> petsAvailable();
}

class MyPetStore implements PetStore {
    @Override
    public List<String> petsAvailable() {
        List<String> pets = new ArrayList<>();
        pets.add("Fluffy");
        pets.add("Sparky");
        pets.add("Whiskers");
        pets.add("Buddy");
        pets.add("Max");
        return pets;
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyPetStoreTest {
    @Test
    void testPetsAvailable() {
        MyPetStore petStore = new MyPetStore();
        List<String> availablePets = petStore.petsAvailable();
        assertEquals(5, availablePets.size());
        assertTrue(availablePets.contains("Fluffy"));
        assertTrue(availablePets.contains("Sparky"));
    }
}   
