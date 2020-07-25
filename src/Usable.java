import java.util.List;

public interface Usable {
    int usesLeft();

    List<ItemEffect> use();
}
