package pl.bpiotrowski.zadanie1;

public class Para<T> {
    private T itemA;
    private T itemB;

    Para(final T itemA, final T itemB) {
        this.itemA = itemA;
        this.itemB = itemB;
    }

    public T getItemA() {
        return itemA;
    }

    public void setItemA(final T itemA) {
        this.itemA = itemA;
    }

    public T getItemB() {
        return itemB;
    }

    public void setItemB(final T itemB) {
        this.itemB = itemB;
    }

    @Override
    public String toString() {
        return itemA + ", " + itemB;
    }
}
