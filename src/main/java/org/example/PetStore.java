package org.example;

import java.util.List;

public interface PetStore {
    public List<String> petsAvailable();
}

class MyPetStore implements PetStore {
    @Override
    public List<String> petsAvailable() {
        return List.of("Fluffy", "Spot", "Whiskers", "Max", "Bella");
    }
} 
