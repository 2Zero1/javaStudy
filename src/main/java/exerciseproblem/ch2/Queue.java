package exerciseproblem.ch2;

public class Queue {
    Node front;
    Node tail;

    public static class Node {
        Node next;
        int num;

        public Node(Node next, int num) {
            this.next = next;
            this.num = num;
        }
    }

    public class Iterator {
        private Node node = front;

        public boolean hasNext() {
            return node != null;
        }
        public Node next() {
            Node tmp = node;
            node = tmp.next;
            return tmp;
        }

    }
    public Iterator getIterator() {
        return new Iterator();
    }


    public void add(int num) {
        if (front == null) {
            front = new Node(null, num);
            tail = front;
        } else {
            tail.next = new Node(null, num);
            tail = tail.next;
        }
    }

    public Node delete() {
        if (front != null) {
            Node tmp = front;
            front = front.next;
            return tmp;
        }
        return null;
    }

    public void printAll() {
        Node cur = front;
        do {
            System.out.print(cur.num + " ");
            cur = cur.next;
        } while (cur != null);
    }

}
