package exerciseproblem.ch4.No6;

public class Main {
    public static void main(String[] args) {

        DiscountedItem item1 = new DiscountedItem("hello",11,2);
        Item item = new Item("hello",11);
        System.out.println(item.equals(item1));
        System.out.println(item1.equals(item));

    }
}
