package org.example;

import java.math.BigDecimal;
import java.util.List;

public interface PetStore {
    List<String> allPets();
    BigDecimal petCost(String petName);
    BigDecimal buyPet(String petName);
    BigDecimal withdrawAllCash();
}