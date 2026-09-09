package Player_Action;

import Mechanics.Add_Item;
import Mechanics.Game_backend;

public class Mine_Jungle  extends Game_backend {
    public Mine_Jungle() {

        int wykopane = random.nextInt(2);
        switch (wykopane){
            case 0:
                System.out.println("You mine mossy cobblestone!");
                Add_Item add_item = new Add_Item(mossy_cobblestone, "mossy_cobblestone");
                break;
            case 1:
                System.out.println("You mine blue jungle_sapling!");
                Add_Item add_item2 = new Add_Item(jungle_sapling, "jungle_sapling");
                break;
        }

    }
}
