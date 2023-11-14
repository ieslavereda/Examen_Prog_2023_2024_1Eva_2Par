package es.ieslavereda;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static es.ieslavereda.Exercise01.*;
import static org.junit.jupiter.api.Assertions.*;

class Exercise01Test {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void count55Test() {
        assertEquals(2,count55("55abc55"));
        assertEquals(3,count55("abc55x55x55"));
        assertEquals(1,count55("555"));
        assertEquals(2,count55("5555"));
        assertEquals(0,count55("5"));
        assertEquals(0,count55(""));
        assertEquals(0,count55("ho"));
        assertEquals(4,count55("55x555x5555"));
        assertEquals(1,count55("5x555"));
        assertEquals(0,count55("1hola1"));
        assertEquals(0,count55("hola"));
    }

    @Test
    void count55iteraTest() {
        assertEquals(2,count55itera("55abc55"));
        assertEquals(3,count55itera("abc55x55x55"));
        assertEquals(1,count55itera("555"));
        assertEquals(2,count55itera("5555"));
        assertEquals(0,count55itera("5"));
        assertEquals(0,count55itera(""));
        assertEquals(0,count55itera("ho"));
        assertEquals(4,count55itera("55x555x5555"));
        assertEquals(1,count55itera("5x555"));
        assertEquals(0,count55itera("1hola1"));
        assertEquals(0,count55itera("hola"));
    }

    @Test
    void array73Test() {
        assertEquals(1,array73(new int[]{1, 2, 73}, 0));
        assertEquals(2,array73(new int[]{73, 73}, 0));
        assertEquals(0,array73(new int[]{1, 2, 3, 4}, 0));
        assertEquals(3,array73(new int[]{1, 73, 3, 73, 73}, 0));
        assertEquals(1,array73(new int[]{73}, 0));
        assertEquals(0,array73(new int[]{7}, 0));
        assertEquals(0,array73(new int[]{}, 0));
        assertEquals(2,array73(new int[]{73, 2, 3, 4, 73, 5}, 0));
        assertEquals(2,array73(new int[]{73, 5, 73}, 0));
    }

    @Test
    void array73IteraTest() {
        assertEquals(1,array73itera(new int[]{1, 2, 73}, 0));
        assertEquals(2,array73itera(new int[]{73, 73}, 0));
        assertEquals(0,array73itera(new int[]{1, 2, 3, 4}, 0));
        assertEquals(3,array73itera(new int[]{1, 73, 3, 73, 73}, 0));
        assertEquals(1,array73itera(new int[]{73}, 0));
        assertEquals(0,array73itera(new int[]{7}, 0));
        assertEquals(0,array73itera(new int[]{}, 0));
        assertEquals(2,array73itera(new int[]{73, 2, 3, 4, 73, 5}, 0));
        assertEquals(2,array73itera(new int[]{73, 5, 73}, 0));
    }

}