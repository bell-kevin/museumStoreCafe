/** ****************************************************************************
 * MuseumStoreCafe.java
 * Kevin Bell
 *
 * This program maintains inventory for a museum store cafe using
 * an ArrayList, For-Each loops, and anonymous objects
 **************************************************************************** */
package museumstorecafe;

import java.util.*; //Scanner, ArrayList

public class MuseumStoreCafe {

    public static void main(String[] args) {
        //declarations
        Scanner computerKeyboardInput = new Scanner(System.in);
        ArrayList<Item> menu = new ArrayList<>();
        Item item;
        int answer;
        String searchTerm = "";
        //instantiate, then add to ArrayList
        item = new Item("cheeseburger", "entree", 4.5, 10);
        menu.add(0, item);
        item = new Item("fries", "side", 1, 20);
        menu.add(1, item);
        item = new Item("soda", "drink", 1, 25);
        menu.add(2, item);
        item = new Item("ice cream", "dessert", 1.25, 25);
        menu.add(3, item);
        //anonymous
        menu.add(new Item("chicken nuggets", "entree", 4, 10));
        menu.add(new Item("salad", "side", 2.75, 5));
        menu.add(new Item("milk", "drink", 1, 25));
        menu.add(new Item("cookie", "dessert", .75, 10));
        //output - display entire menu
        System.out.println("Module 4 Compentency Exercise by Kevin Bell\n");
        System.out.println("Printing entire menu");
        for (Item obj : menu) {
            obj.displayItem();
        } //end for each
        //output - display items in selected menu category
        System.out.print("\nWhat type of item do you want to see?\n"
                + "(1) entree  (2) side  (3) drink  (4) dessert : ");
        answer = computerKeyboardInput.nextInt();
        switch (answer) {
            case 1:
                searchTerm = "entree";
                break;
            case 2:
                searchTerm = "side";
                break;
            case 3:
                searchTerm = "drink";
                break;
            case 4:
                searchTerm = "dessert";
                break;
        } //end switch
        for (Item obj : menu) {
            if (obj.getCategory().contains(searchTerm)) {
                obj.displayItem();
            } //end if
        } //end for each
    } //end main
} //end class MuseumStoreCafe
