package exerciseproblem.ch4.No6;


public class DiscountedItem extends Item {
    private double discount;

    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if(this.getClass().equals(super.getClass())){
            return true;
        }
        DiscountedItem other = (DiscountedItem) obj;
        return other.discount == this.discount;
    }
}
