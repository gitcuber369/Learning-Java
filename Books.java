public class Books {
    private String title;
    private String author;
    private double price;

    public Books(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price; 
    }
    public void displayDetails() {
        System.out.println("title of the book :  " + title);
        System.out.println("author of the book : " + author);
        System.out.println("price of the book : " + price);
    }
}
     class EBook extends Books{
        private String format;

        public EBook (String title, String author, double price, String format) {
            super(title, author, price);
            this.format=format;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Format of the book : " + format);
    }
    public static void main(String[] args) {
        EBook ebook = new EBook("Subttel art of not giving a fuck", "Victor Timely", 250, "PDF");

        ebook.displayDetails();
    }
}