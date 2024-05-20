public class MyLinkedList<E> {
    private int size;
    private E element;
    private Node<E> head;
    private Node<E> tail;
    private Node<E> oldTail;
    private Node<E> oldHeadForOnceNode;


    public void add(E element) {
        if (this.element == null) {
            Node<E> newNode = new Node<>(element);
            head = newNode;
            this.size = ++size;
            this.element = element;
        } else if (this.size == 1) {
            Node<E> newNode = new Node<>(element); //new Node<>(element, first, last), //new Node<>(element, first, last)
            tail = newNode;
            oldTail = tail;
            head.setNext(tail);
            tail.setPrev(head);
            this.size = ++size;
        } else if (this.size > 1) {
            Node<E> newNode = new Node<>(element);
            tail = newNode;
            tail.setPrev(oldTail);
            oldTail.setNext(tail);
            oldTail = tail;
            this.size = ++size;
        }
    }

    public Node<E> getElement(int indexNumber) {
        System.out.println(size);
        Node<E> forUse = head;
        if (indexNumber < size) {
            if (indexNumber == 0) {
                System.out.println(head.getElementNode());
            } else {
                for (int i = 1; i <= indexNumber; i++) {
                    forUse = forUse.getNext();
                }
                System.out.println(forUse);
                return forUse;
            }
        } else {
            System.out.println("Индекс больше длины списка");
            return null;
        }
        return null;
    }

    private class Node<E> {
        private E elementNode;
        private Node<E> next;
        private Node<E> prev;


        public Node(E elementNode) {
            this.elementNode = elementNode;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "elementNode=" + elementNode +
                    '}';
        }

        public E getElementNode() {
            return elementNode;
        }

        public void setElementNode(E elementNode) {
            this.elementNode = elementNode;
        }

        public Node<E> getNext() {
            return next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
    }
}

//Get от хвоста до головы, а не от головы до хвоста

/*public Node<E> getElement(int indexNumber) {
        Node<E> forUse = tail;
        if (indexNumber < size) {
            System.out.println("Первый if");
            if (indexNumber == size - 1) {
                System.out.println(tail.getElementNode());
            } else {
                for (int i = size - 1; i > indexNumber; i--) {
                    forUse = forUse.getPrev();
                }
                System.out.println(forUse);
                return forUse;
            }
        } else {
            System.out.println("Индекс больше длины списка");
            return null;
        }
        return null;
    }*/
