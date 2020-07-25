import java.util.List;

public interface Usable extends Item {
    int usesLeft();

    List<ItemEffect> use();
}
