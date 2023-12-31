public class Product {
    private String name; 
    private double price;
    private int qunatity;

    public Product(String name, double price, int qunatity) {
        this.name=name;
        this.price = price;
        this.qunatity = qunatity;
    }
    public void displayDetails(){
        System.out.println("name of the product : " + name);
        System.out.println("price of the product : " + price);
        System.out.println("qunatity of the product : " + qunatity);
    }

    }
     class ElectronicProduct extends Product {
        private int Warranty;
        private String PowerConsuption;

        public ElectronicProduct (String name, double price, int qunatity, int Warranty, String powerConsuption) {
            super(name, price, qunatity);
            this.PowerConsuption=powerConsuption;
            this.Warranty=Warranty;
        }
        public void displayDetails(){
            super.displayDetails();
            System.out.println("Waranty of the product : " + Warranty);
            System.out.println("Powern consuption by the product : " + PowerConsuption);
        }

        public static void main(String[] args) {
            ElectronicProduct electronicProduct = new ElectronicProduct("Keyboard", 2000, 2, 1, "2 Watt");

            electronicProduct.displayDetails();
        }

}