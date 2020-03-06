package exerciseproblem.ch2;

public class No17 {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        Queue.Iterator iterator= queue.getIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next().num);
        }

    }
}
