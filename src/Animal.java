public interface Animal {

    String sound();


    void eatgrass();
    void eatleaves();
    void sleep();
    void walk();

    default void info() {
        System.out.println("eatleaves" +sound());
    }

    static int age(){
        return 10;
    }
}
