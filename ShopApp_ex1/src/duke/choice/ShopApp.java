/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

/**
 *
 * @author jackr
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double tax = 0.2;
        double total = 0.0;
        

        System.out.println("Welcome to Duke Choice Shop");
        System.out.println("Minimum price: "+Clothing.MIN_PRICE);
        Customer c1 = new Customer("Pinky",14);
        
        

//        System.out.println("Customer is: " + c1.getName());
        Clothing item1 = new Clothing("Blue Jacket",20.9,"M");
        Clothing item2 = new Clothing("Orange T-Shirt",10.5,"S");

//        Initialize a clothing array
        Clothing[] items = {item1, item2, new Clothing("Green Scarf",5.0,"S"), new Clothing("Blue T-Shirt",10.5,"S")};

       

//        System.out.println("Item 1" + "," + item1.description + "," + item1.price + "," + item1.size);
//        System.out.println("Item 2" + "," + item2.description + "," + item2.price + "," + item2.size);
//        total = (item1.price + item2.price + item3.price) * 1 + tax;
        int measurement = 3;

        c1.addItems(items); //Add items to the customers

       
        System.out.println("Customer is " + c1.getName() + "," + c1.getSize() + "," + c1.getTotalClothingCost());
//        Iterate through the clothing items list and get the decription for each item and print
        for (Clothing item : c1.getItems()) {
            System.out.println("Items " + item.getDescription());

        }

    }

}
