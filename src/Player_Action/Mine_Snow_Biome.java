package Player_Action;

import Mechanics.Add_Item;
import Mechanics.Game_backend;

public class Mine_Snow_Biome  extends Game_backend {
    public Mine_Snow_Biome() {

        int wykopane = random.nextInt(3);
        switch (wykopane){
            case 0:
                System.out.println("You collect some snow, because why not?");
                Add_Item add_item = new Add_Item(powder_snow_bucket, "powder_snow_bucket");
                break;
            case 1:
                System.out.println("You mine blue ice!");
                Add_Item add_item2 = new Add_Item(blue_ice, "blue_ice");
                break;
            case 2:
                System.out.println("You find weird key!");
                Add_Item add_item3 = new Add_Item(trial_key, "trial_key");
                break;
        }

    }
}
