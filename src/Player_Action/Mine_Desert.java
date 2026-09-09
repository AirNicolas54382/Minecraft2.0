package Player_Action;

import Mechanics.Add_Item;
import Mechanics.Game_backend;

public class Mine_Desert  extends Game_backend {
    public Mine_Desert() {

        int wykopane = random.nextInt(2);
        switch (wykopane){
            case 0:
                System.out.println("You mine sand!");
                Add_Item add_item = new Add_Item(sand, "sand");
                break;
            case 1:
                System.out.println("You mine cactus!");
                Add_Item add_item2 = new Add_Item(cactus_side, "cactus_side");
                break;
        }

    }
}
