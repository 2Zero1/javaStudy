package exercise.Ch4;

public class DiscountedItem extends Item {
    private double discount;

    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        DiscountedItem other = (DiscountedItem) obj;
        return other.discount == this.discount;
    }
}
