package exerciseproblem.ch2;

public class No16 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.printAll();
        queue.delete();
        System.out.println();
        queue.printAll();
    }
}

