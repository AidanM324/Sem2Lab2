package ie.atu;

import java.sql.SQLOutput;

public class OnlineOrderingSystem {

    public static void main(String[] args) {
        //Create an array or list of MenuItem objects
        Menuitem[] menuitems = new Menuitem[] {
                //Add new menu Items
        };

        //display details of each menu item
        for(Menuitem menuitem : menuitems){
            //Print out the Name, description and Price for each item
        }

        //Calculate and display the total cost of the order
        double totalCost = 0;
        for(Menuitem menuitem : menuitems){
            //totalCost of all the menuitem prices in an order
        }
        System.out.println("Total Cost: £" + totalCost);
    }
}
