package org.example;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class GdanskPetStore implements PetStore {

    private BigDecimal totalBalance = BigDecimal.ZERO;
    private final List<String> pets = Arrays.asList("Cat", "Dog", "Hamster", "Goldfish", "Goldfish");

    @Override
    public List<String> allPets() {
        return pets;
    }

    @Override
    public BigDecimal petCost(String petName) {
        switch (petName) {
            case "Cat":
                return BigDecimal.valueOf(30);
            case "Dog":
                return BigDecimal.valueOf(300);
            case "Hamster":
                return BigDecimal.valueOf(10);
            case "Goldfish":
                return BigDecimal.TEN;
            default:
                throw new IllegalArgumentException("Invalid pet name: " + petName);
        }
    }

    @Override
    public BigDecimal buyPet(String petName) {
        BigDecimal petCost = petCost(petName);
        totalBalance = totalBalance.add(petCost);
        return totalBalance;
    }

    @Override
    public BigDecimal withdrawAllCash() {
        BigDecimal cash = totalBalance;
        totalBalance = BigDecimal.ZERO;
        return totalBalance;
    }
}



