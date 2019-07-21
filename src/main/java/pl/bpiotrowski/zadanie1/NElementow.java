package pl.bpiotrowski.zadanie1;

import java.util.Arrays;

public class NElementow<T> {
    private T[] elements;

    public NElementow(final T[] elements) {
        this.elements = elements;
    }

    public T[] getElements() {
        return elements;
    }

    public void setElements(final T[] elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "NElementow{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
