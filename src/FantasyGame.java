import java.util.List;
import java.util.Random;

public class FantasyGame {
    public static void main(String[] args) {

        List<Slot> player1Slots = List.of(
            new Slot(SlotType.Chest, 1),
            new Slot(SlotType.Legs, 2),
            new Slot(SlotType.Hand, 2),
            new Slot(SlotType.Finger, 10));

        List<Slot> player2Slots = List.of(
            new Slot(SlotType.Chest, 1),
            new Slot(SlotType.Legs, 2),
            new Slot(SlotType.Hand, 2),
            new Slot(SlotType.Finger, 10));

        var player1 = new Player(player1Slots, "player1");
        var player2 = new Player(player2Slots, "player2");

        List<Player> playerList = List.of(player1, player2);
        playerList.forEach(player ->
            System.out.println(player.getPlayerName() + " stats without equipment : " + player.printPlayerStats())
        );
        var ring1 = new RingOfHealth();
        var armor = new FlimsyLeatherArmor();
        var relicOfAncients = new RelicOfTheAncients();
        var secondArmor = new FlimsyLeatherArmor();
        var wristband = new WristbandOfMana();
        List<Item> listOfItems = List.of(ring1, armor, relicOfAncients, secondArmor, wristband);
        //items get picked up randomly by the two players
        listOfItems.stream().forEach(e -> {
            var randomPlayer = playerList.get(new Random().nextInt(playerList.size()));
            randomPlayer.pickUp(e);
        });
        //players are equipped with the picked up items
        playerList.forEach(player ->
            player
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
                }));
//        player1.drop(armor);
//        player1.drop(secondArmor);
        playerList.forEach(player -> {
            System.out.println(player.getPlayerName() + " stats with equipment : " + player.printPlayerStats());
            player.showInventory();
            System.out.println(player.getPlayerName() + " player level is :" + player.getLevel());
            System.out.println(player.printPlayerStats());
            while (player.getLevel() < 5) {
                var XP = getRandomInt(500, 1000);
                System.out.println(player.getPlayerName() + " player gained " + XP + " experience");
                player.addXP(XP);
                System.out.println(player.getPlayerName() + " is now level "
                    + player.getLevel() + ". His stats are :" + player.printPlayerStats());

            }
        });


    }

    public static int getRandomInt(int min, int max) {
        return new Random().nextInt(max - min) + min;
    }
}
