package pl.bpiotrowski.list;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Character> linkedList = new MyLinkedList<>();

        linkedList.addElement('A');
        linkedList.addElement('U');
        linkedList.addElement('T');
        linkedList.addElement('O');
        linkedList.addElementToStart('X');
        linkedList.removeElement(3);
        linkedList.addElementAfterIndex('Y',2);

        System.out.println(linkedList.getFirstElement());
        System.out.println(linkedList.getElement(1));
        linkedList.printAllNodes();
        linkedList.reverse();
        System.out.println();
        linkedList.printAllNodes();
    }
}
