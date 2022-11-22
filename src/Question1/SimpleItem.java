package Question1;

public class SimpleItem {
    private String itemName;

    public SimpleItem(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return itemName;
    }
}
