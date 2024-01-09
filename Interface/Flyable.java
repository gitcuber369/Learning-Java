package Interface;

public interface Flyable {
    void fly_obj();
}

class Aeroplane implements Flyable {
    public void fly_obj() {
        System.out.println("Hello from Aeroplane");
    }
}

class Spaceship implements Flyable {
    public void fly_obj() {
        System.out.println("Hello from Space");
    }
}

class Helicopter implements Flyable {
    public void fly_obj() {
        System.out.println("Hello from Helicopter");
    }
}

class Mainnew {
    public static void main(String[] args) {
        Flyable[] flyingObjects = { new Aeroplane(), new Spaceship(), new Helicopter() };

        for (Flyable obj : flyingObjects) {
            obj.fly_obj();
        }
    }
}
