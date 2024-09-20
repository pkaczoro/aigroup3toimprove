package org.example;

import java.util.List;

public interface PetStore {
    List<String> getAvailablePets();
}
```

```java
package org.example.tests;

import org.example.PetStore;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PetStoreTest {

    @Test
    void testGetAvailablePets() {
        PetStore store = new MockPetStore();
        List<String> availablePets = store.getAvailablePets();
        assertEquals(3, availablePets.size());
        assertTrue(availablePets.contains("Cat"));
        assertTrue(availablePets.contains("Dog"));
        assertTrue(availablePets.contains("Fish"));
    }
}

class MockPetStore implements PetStore {
    @Override
    public List<String> getAvailablePets() {
        return List.of("Cat", "Dog", "Fish");
    }
}
