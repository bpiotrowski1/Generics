package pl.bpiotrowski.list;

class MyLinkedList<T> {
    private MyNode<T> head = null;

    void addElement(T value) {
        MyNode<T> node = new MyNode<>(value);
        if(head == null) {
            head = node;
        } else {
            MyNode<T> iterator = head;
            while (iterator.getNextNode() != null) {
                iterator = iterator.getNextNode();
            }
            iterator.setNextNode(node);
        }
    }

    void addElementToStart(T value) {
        MyNode<T> node = new MyNode<>(value);
        node.setNextNode(head);
        head = node;
    }

    void addElementAfterIndex(T value, int index) {
        MyNode<T> node = new MyNode<>(value);
        MyNode<T> iterator = head;
        for (int i = 0; i < index; i++) {
            iterator = iterator.getNextNode();
        }
        node.setNextNode(iterator.getNextNode());
        iterator.setNextNode(node);
    }

    T getFirstElement() {
        return head.getValue();
    }

    T getElement(int index) {
        MyNode<T> iterator = head;
        for (int i = 0; i < index; i++) {
            iterator = iterator.getNextNode();
        }
        return iterator.getValue();
    }

    void removeElement(int index) {
        if(index == 0) {
            head = head.getNextNode();
        } else {
            MyNode<T> iterator = head;
            for (int i = 0; i < index - 1; i++) {
                iterator = iterator.getNextNode();
            }
            iterator.setNextNode(iterator.getNextNode().getNextNode());
        }
    }

    void reverse() {
        MyLinkedList<T> newList = new MyLinkedList<>();
        MyNode<T> iterator = head;

        while (iterator != null) {
            newList.addElementToStart(iterator.getValue());
            iterator = iterator.getNextNode();
        }

        this.head = newList.head;
    }

    void printAllNodes() {
        MyNode<T> iterator = head;
        while (iterator.getNextNode() != null) {
            System.out.print(iterator.getValue() + " ");
            iterator = iterator.getNextNode();
        }
        System.out.print(iterator.getValue());
    }
}
