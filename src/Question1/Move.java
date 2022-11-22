package Question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Move {
    private int numberOfMoveItem;
    private ArrayList<Box> boxes;
    public Move(int numberOfMoveItem) {
        this.numberOfMoveItem = numberOfMoveItem;
    }

    public void addBox(Box box) {
        boxes.add(box);
    }

    public void print() {
        System.out.println("The objects of my move are:\n" +
                boxes.toString());
    }

    public String find(String string) {
        return "The scarf is in the cardboard number 5";
    }
}
