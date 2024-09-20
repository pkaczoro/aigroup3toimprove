package org.example;

import java.util.List;

public interface PetStore {
    public List<String> petsAvailable();
}


package org.example;

import java.util.ArrayList;
import java.util.List;

public class PetStoreImpl implements PetStore {

    @Override
    public List<String> petsAvailable() {
        List<String> pets = new ArrayList<>();
        pets.add("Fluffy");
        pets.add("Spot");
        pets.add("Whiskers");
        pets.add("Max");
        pets.add("Bella");
        return pets;
    }
}
```

```java
package org.example.test;

import org.example.PetStore;
import org.example.PetStoreImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PetStoreTest {

    @Test
    void testPetsAvailable() {
        PetStore petStore = new PetStoreImpl();
        List<String> availablePets = petStore.petsAvailable();
        assertEquals(5, availablePets.size());
        assertTrue(availablePets.contains("Fluffy"));
        assertTrue(availablePets.contains("Spot"));
    }
}
