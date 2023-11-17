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
    void strCountTest() {
        assertEquals(2,strCount("catcowcat", "cat"));
        assertEquals(1,strCount("catcowcat", "cow"));
        assertEquals(0,strCount("catcowcat", "dog"));
        assertEquals(2,strCount("cacatcowcat", "cat"));
        assertEquals(2,strCount("xyx", "x"));
        assertEquals(4,strCount("iiiijj", "i"));
        assertEquals(2,strCount("iiiijj", "ii"));
        assertEquals(1,strCount("iiiijj", "iii"));
        assertEquals(2,strCount("iiiijj", "j"));
        assertEquals(1,strCount("iiiijj", "jj"));
        assertEquals(4,strCount("aaabababab", "ab"));
        assertEquals(1,strCount("aaabababab", "aa"));
        assertEquals(6,strCount("aaabababab", "a"));
        assertEquals(4,strCount("aaabababab", "b"));
    }

    @Test
    void strCountIteraTest() {
        assertEquals(2,strCountItera("catcowcat", "cat"));
        assertEquals(1,strCountItera("catcowcat", "cow"));
        assertEquals(0,strCountItera("catcowcat", "dog"));
        assertEquals(2,strCountItera("cacatcowcat", "cat"));
        assertEquals(2,strCountItera("xyx", "x"));
        assertEquals(4,strCountItera("iiiijj", "i"));
        assertEquals(2,strCountItera("iiiijj", "ii"));
        assertEquals(1,strCountItera("iiiijj", "iii"));
        assertEquals(2,strCountItera("iiiijj", "j"));
        assertEquals(1,strCountItera("iiiijj", "jj"));
        assertEquals(4,strCountItera("aaabababab", "ab"));
        assertEquals(1,strCountItera("aaabababab", "aa"));
        assertEquals(6,strCountItera("aaabababab", "a"));
        assertEquals(4,strCountItera("aaabababab", "b"));
    }

    @Test
    void binarioIterTest(){
        assertEquals("1010",binarioIter(10));
        assertEquals("111",binarioIter(7));
        assertEquals("1111",binarioIter(15));
        assertEquals("100",binarioIter(4));
    }

    @Test
    void binarioRecurTest(){
        assertEquals("1010",binarioRecur(10));
        assertEquals("111",binarioRecur(7));
        assertEquals("1111",binarioRecur(15));
        assertEquals("100",binarioRecur(4));
    }

}