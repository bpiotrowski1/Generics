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

    MyNode getFirstElement() {
        return head;
    }

    MyNode getElement(int index) {
        MyNode iterator = head;
        for (int i = 0; i < index; i++) {
            iterator = iterator.getNextNode();
        }
        return iterator;
    }

    void removeElement(int index) {
        MyNode<T> iterator = head;
        for (int i = 0; i < index - 1; i++) {
            iterator = iterator.getNextNode();
        }
        iterator.setNextNode(iterator.getNextNode().getNextNode());
    }
}
