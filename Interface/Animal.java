package Interface;

public interface Animal {
    void Sound();
}

class Dog implements Animal {
    private String dogSound;

    public Dog(String dogSound) {
        this.dogSound = dogSound;
    }

    public void Sound() {
        System.out.println("Woof");

    }
}

class Main {
    public static void main(String[] args) {
        Dog dg = new Dog("Woof");
        dg.Sound();
    }
}
