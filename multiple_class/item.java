public class item {
   
    int price; 
    float weight;
    int quantity;
    boolean canbetraded;
    String description;
   


    public void sayMyDescription() {
        System.out.println("Please buy me. " + description);
    }

    public void sayMyPrice() {
        System.out.println("Item Price: " + price);
    }

    public void sayMyWeight() {
        System.out.println("Item Weight: " + weight + "g");
    }

    public void sayMyQuantity() {
        System.out.println("Item Quantity: " + quantity);
    }

    public void sayMyCanbetraded() {
        System.out.println("Item Negotiability: " + canbetraded + "\n");
    }
    
 
}