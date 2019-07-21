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

        System.out.println(linkedList.getFirstElement().getValue());
        System.out.println(linkedList.getElement(1).getValue());
        System.out.println(linkedList.getElement(2).getValue());
        System.out.println(linkedList.getElement(3).getValue());
        System.out.println(linkedList.getElement(4).getValue());
    }
}
