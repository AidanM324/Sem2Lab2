package ie.atu;

public class OnlineOrderingSystem {

    public static void main(String[] args) {
        //Create an array or list of MenuItem objects
        MenuItem[] menuitems = new MenuItem[]{
                //Add new menu Items
            new Burger("Classic Burger", 8.99, "Beef Patty, Lettuce, Tomato, Burger Sauce"),
            new Pizza("Meatfeast Pizza", 14.99, "Pizza Base, Pepperoni, Chicken, Bacon, Cheese"),
            new Salad("Healthy Salad", 10.99, "Lettuce, Croutons, Tomato, Salad Dressing"),
                new Dessert("Hot Lava Cake", 7.99, "Chocolate, Sugar, Flour, Cream"),

        };

        //display details of each menu item
        for(MenuItem menuitem : menuitems){
            //Print out the Name, description and Price for each item
            System.out.println("Order: " + menuitem.getName() + "\nDescription: " + menuitem.getDescription() + "\nPrice: " + menuitem.getPrice() + "\n");
        }

        //Calculate and display the total cost of the order
        double totalCost = 0;
        for(MenuItem menuitem : menuitems){
            //totalCost of all the menuitem prices in an order
            totalCost = menuitem.getPrice() + totalCost;
        }
        System.out.println("Total Cost: €" + totalCost);
    }
}
