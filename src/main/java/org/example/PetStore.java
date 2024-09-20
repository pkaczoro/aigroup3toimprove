package org.example;

import java.util.Arrays;
import java.util.List;

public class PetStoreImpl implements PetStore {
    @Override
    public List<String> petsAvailable() {
        return Arrays.asList("Buddy", "Lucy", "Max", "Bella", "Charlie");
    }
} 
