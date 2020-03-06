package exerciseproblem.ch2;

import java.util.ArrayList;

public class Invoice {
    public static class Item{
        private String description;
        private int quantity;
        private double unitPrice;

        public Item(String description, int quantity, double unitPrice) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }

        double price() { return quantity * unitPrice; }
    }

    private ArrayList<Item> items = new ArrayList<>();

    public void add(Item item) { items.add(item);}

    public void print() {
        for (Item item : items) {
            System.out.println(item.description);
        }
    }


}