package pl.bpiotrowski.list;

import lombok.Getter;
import lombok.Setter;

class MyNode<T> {
    @Getter private T value;
    @Getter @Setter private MyNode<T> nextNode;

    MyNode(final T value) {
        this.value = value;
    }
}
