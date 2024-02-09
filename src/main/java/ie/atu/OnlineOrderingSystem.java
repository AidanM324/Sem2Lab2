package ie.atu;

public class OnlineOrderingSystem {

    public static void main(String[] args) {
        //Create an array or list of MenuItem objects
        MenuItem[] menuitems = new MenuItem[10] {
                //Add new menu Items
            new Burger("Classic Burger", 8.99, "Beef Patty, Lettuce, Tomato, Burger Sauce");

        };

        //display details of each menu item
        for(MenuItem menuitem : menuitems){
            //Print out the Name, description and Price for each item
        }

        //Calculate and display the total cost of the order
        double totalCost = 0;
        for(MenuItem menuitem : menuitems){
            //totalCost of all the menuitem prices in an order
        }
        System.out.println("Total Cost: £" + totalCost);
    }
}
