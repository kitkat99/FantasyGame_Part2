import java.util.List;
import java.util.Random;

public class FantasyGame {
    public static void main(String[] args) {

        List<Slot> player1Slots = List.of(
            new Slot(SlotType.Chest, 1),
            new Slot(SlotType.Legs, 2),
            new Slot(SlotType.Hand, 2),
            new Slot(SlotType.Finger, 10));

        var player1 = new Player(player1Slots);

        player1
            .getSlots()
            .forEach(e -> System.out.println(e.toString()));
        System.out.println("player stats without equipment : " + player1.printPlayerStats());
        var ring1 = new RingOfHealth();
        var armor = new FlimsyLeatherArmor();
        var relicOfAncients = new RelicOfTheAncients();
        var secondArmor = new FlimsyLeatherArmor();
        var wristband = new WristbandOfMana();
        List<Item> listOfItems = List.of(ring1, armor, relicOfAncients, secondArmor, wristband);
        listOfItems.stream().forEach(e -> player1.pickUp(e));
        player1
            .getInventory()
            .stream()
            .filter(elem -> elem instanceof Equippable)
            .forEach(e ->
            {
                Slot slot = player1Slots
                    .stream()
                    .filter(x -> x.getSlotType() == ((Equippable) e).getSlotType())
                    .findAny()
                    .orElse(null);
                if (slot != null) {
                    slot.equip(e);
                }
            });
//        player1.drop(armor);
//        player1.drop(secondArmor);

        System.out.println("player stats with equipment : " + player1.printPlayerStats());
        player1.showInventory();
        System.out.println("player level is :" + player1.getLevel());
        System.out.println(player1.printPlayerStats());

        while (player1.getLevel() < 5) {
            var XP = getRandomXP(500, 1000);
            System.out.println("player gained " + XP + " experience");
            player1.addXP(XP);
            System.out.println("player level is :" + player1.getLevel());
            System.out.println(player1.printPlayerStats());

        }

    }

    public static int getRandomXP(int min, int max) {
        return new Random().nextInt(max - min) + min;
    }
}
