package Question1;

import java.util.ArrayList;

public class Box {

    private ArrayList<SimpleItem> items = new ArrayList<>();

    private int numberOfItems;
    private int noOfBox;

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public int getNoOfBox() {
        return noOfBox;
    }

    public Box(int numberOfItems, int noOfBox) {
        this.numberOfItems = numberOfItems;
        this.noOfBox = noOfBox;
    }

    public void addItem(SimpleItem item) {
        items.add(item);
    }

    public void addItem(Box box) {
        items.addAll(box.items);
    }

    @Override
    public String toString() {
        return "" + items;
    }
}
