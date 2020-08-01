import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Slot {
    private SlotType slotType;
    private int capacity;
    private Set<Item> listOfItems = new HashSet<>();

    public boolean equip(Item item) throws IllegalArgumentException {
        try {
            if (!(item instanceof Equippable)) {
                throw new IllegalArgumentException("Item is not equippable");
            } else {
                if (((Equippable) item).getSlotType() != slotType) {
                    throw new IllegalArgumentException("item does not fit in the current slot!");
                } else {
                    if (capacity == 0) {
                        System.out.println("max number of items in slot reached");
                        return false;
                    } else {
                        if (this.isDuplicateItem(item)) {
                            throw new IllegalArgumentException("item already exists in slot");
                        }
                        listOfItems.add(item);
                        capacity--;
                        return true;
                    }
                }
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }

    }


    private boolean isDuplicateItem(Item item) {
        return this.listOfItems.stream().anyMatch(x -> x.getItemName().equals(item.getItemName()));
    }

    public Slot(SlotType slotType, int capacity) {
        this.slotType = slotType;
        this.capacity = capacity;
    }

    public Set<Item> getListOfItems() {
        return listOfItems;
    }

    public SlotType getSlotType() {
        return slotType;
    }

    @Override
    public String toString() {
        return "SlotType: " + this.slotType + " SlotCapacity: " + this.capacity;
    }
}
