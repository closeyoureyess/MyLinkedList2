public class MyLinkedList<E> {
    private int size;
    private E element;
    private E element2;
    private Node<E> first;
    private Node<E> last;
    private Node<E> x1;
    private Node<E> x2;

    public void add(E element) {
        if (last == null) {
            size = 0;
            this.element = element;
            Node<E> newNode = new Node<>(element, first, last);
            first = newNode;
            last = newNode;
            this.size = ++size;
            x1 = last;
            System.out.println("Ветка if!");
        } else {
            this.element2 = element;
            Node<E> newNode = new Node<>(element, first, last); //new Node<>(element, first, last), //new Node<>(element, first, last)
            first = newNode;
            first.next = first;
            last.prev = last;
            this.size = ++size;
            x2 = first;
            System.out.println("Ветка else!");
        }
    }

    public Node getElement(int indexNumber) {
        System.out.println(size);
        if (indexNumber < size & indexNumber == 0) {
            System.out.println("Возвращен элемент " + x1);
            return x1;
        }
        if (indexNumber < size & indexNumber == 1) {
            System.out.println("Возвращен элемент " + x2);
            return x2;
        }
        System.out.println("Индекс больше длины списка");
        return null;
    }

    private class Node<E> {
        private E elementNode;
        private Node<E> next;
        private Node<E> prev;

        private Node(E elementNode, Node<E> next, Node<E> prev) {
            this.elementNode = elementNode;
            this.prev = prev;
            this.next = next;

        }

        @Override
        public String toString() {
            return "Node{" +
                    "elementNode=" + elementNode +
                    '}';
        }

    }

}
