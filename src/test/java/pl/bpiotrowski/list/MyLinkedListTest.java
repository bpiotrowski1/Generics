package pl.bpiotrowski.list;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {
    private MyLinkedList<Integer> list = new MyLinkedList<>();

    @Before
    public void begin() {
        list.addElement(100);
        list.addElement(101);
        list.addElement(102);
        list.addElement(103);
        list.addElement(104);
        list.addElement(105);
    }

    @Test
    public void addElement() {
        int expected = 333;

        list.addElement(expected);
        int actual = list.getElement(6);
        assertEquals(expected, actual);
    }

    @Test
    public void addElementToStart() {
        int expected = 444;

        list.addElementToStart(expected);
        int actual = list.getFirstElement();
        assertEquals(expected, actual);
    }

    @Test
    public void addElementAfterIndex() {
        int expected = 555;

        list.addElementAfterIndex(expected, 0);
        int actual = list.getElement(1);
        assertEquals(expected, actual);
    }

    @Test
    public void getFirstElement() {
        int expected = 100;
        int actual = list.getFirstElement();

        assertEquals(expected, actual);
    }

    @Test
    public void getElement() {
        int expected = 103;
        int actual = list.getElement(3);

        assertEquals(expected, actual);
    }

    @Test
    public void removeElement() {
        int a = 555;
        list.addElementAfterIndex(a, 3);
        list.removeElement(4);
        int actual = list.getElement(4);

        assertNotEquals(a, actual);
    }

    @Test
    public void reverse() {
        MyLinkedList copy = list;

        list.reverse();
        list.reverse();

        assertEquals(list, copy);
    }
}