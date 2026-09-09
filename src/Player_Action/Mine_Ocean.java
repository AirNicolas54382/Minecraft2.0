package Player_Action;

import Mechanics.Add_Item;
import Mechanics.Game_backend;

public class Mine_Ocean  extends Game_backend {
    public Mine_Ocean() {

        int wykopane = random.nextInt(2);
        switch (wykopane){
            case 0:
                System.out.println("You find legendary heart of the sea !");
                Add_Item add_item = new Add_Item(heart_of_the_sea, "heart_of_the_sea");
                break;
            case 1:
                System.out.println("You find nautilus shell! ");
                Add_Item add_item2 = new Add_Item(nautilus_shell, "nautilus_shell");
                break;
        }

    }
}
