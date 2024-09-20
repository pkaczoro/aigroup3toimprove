package org.example.model;

import org.example.GdanskPetStore;
import org.example.PetStore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class GdanskPetStoreTest {

    private PetStore underTest;

    @BeforeEach
    public void setUp() {
        underTest = new GdanskPetStore();
    }

    @Test
    public void gdanskPetStoreHasFivePets(){
        List<String> pets = underTest.allPets();

        assertThat(pets).containsExactly("Cat", "Dog", "Hamster", "Goldfish", "Goldfish");
    }

    @Test
    public void allGoldFishCostTenZlotych(){
        BigDecimal goldfishCost = underTest.petCost("Goldfish");

        assertThat(goldfishCost).isEqualTo(BigDecimal.TEN);
    }


    @Test
    public void catCost30Zlotych(){
        BigDecimal catCost = underTest.petCost("Cat");

        assertThat(catCost).isEqualTo(BigDecimal.valueOf(30));
    }


    @Test
    public void dogCost300Zlotych(){
        BigDecimal dogCost = underTest.petCost("Dog");

        assertThat(dogCost).isEqualTo(BigDecimal.valueOf(300));
    }


    @Test
    public void buyingAPetIncreasesTotalBalanceAndReturnsTotalBalance(){
        BigDecimal dogCost = underTest.buyPet("Dog");

        assertThat(dogCost).isEqualTo(BigDecimal.valueOf(300));
    }

    @Test
    public void buyingMultiplePetIncreasesTotalBalance(){
        BigDecimal newBalance = underTest.buyPet("Dog");

        assertThat(newBalance).isEqualTo(BigDecimal.valueOf(300));


        newBalance = underTest.buyPet("Cat");

        assertThat(newBalance).isEqualTo(BigDecimal.valueOf(330));
    }

    @Test
    public void withdrawingAllCashClearsTotalBalance(){
        BigDecimal newBalance = underTest.buyPet("Dog");
        newBalance = underTest.withdrawAllCash();

        assertThat(newBalance).isEqualTo(BigDecimal.ZERO);
    }
}
