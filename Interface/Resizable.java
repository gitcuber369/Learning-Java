package Interface;

public interface Resizable {
    void ResizeWidth(int width);

    void ResizeHeight(int height);
}

class Rectangle implements Resizable {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void ResizeHeight(int height) {
        this.height = height;
    }

    public void ResizeWidth(int width) {
        this.width = width;
    }

    public void printSize() {
        System.out.println("Height of the rectangle : " + height + "\ncd Width of the rectangle : " + width);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(50, 100);

        rectangle.printSize();

        rectangle.ResizeHeight(500);
        rectangle.ResizeWidth(600);
    }
}
