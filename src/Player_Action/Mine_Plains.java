package Player_Action;

import Mechanics.Game_backend;
import Mechanics.Add_Item;

public class Mine_Plains extends Game_backend {
public Mine_Plains(){

    int wykopane = random.nextInt(4);
    switch (wykopane){
        case 0:
            System.out.println("You mine oak_log!");
            Add_Item add_item = new Add_Item(oak_log, "oak_log");
            break;
        case 1:
            System.out.println("You mine cobblestone!");
            Add_Item add_item2 = new Add_Item(cobblestone, "cobblestone");
            break;
        case 2:
            System.out.println("You mine iron_ingot!");
            Add_Item add_item3 = new Add_Item(iron_ingot, "iron_ingot");
            break;
        case 3:
            System.out.println("You mine diamond!");
            Add_Item add_item4 = new Add_Item(diamond, "diamond");
            break;
    }

}
}
