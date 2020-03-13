package exercise.Ch4;

public class EventItem extends DiscountedItem {
    int seq;
    public EventItem(String description, double price, double discount, int seq) {
        super(description, price, discount);
        seq = this.seq;
    }
}
