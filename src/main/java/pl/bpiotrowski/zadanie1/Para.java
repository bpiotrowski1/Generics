package pl.bpiotrowski.zadanie1;

public class Para<T, E> {
    private T itemA;
    private E itemB;

    Para(final T itemA, final E itemB) {
        this.itemA = itemA;
        this.itemB = itemB;
    }

    public T getItemA() {
        return itemA;
    }

    public void setItemA(final T itemA) {
        this.itemA = itemA;
    }

    public E getItemB() {
        return itemB;
    }

    public void setItemB(final E itemB) {
        this.itemB = itemB;
    }

    @Override
    public String toString() {
        return itemA + ", " + itemB;
    }
}
