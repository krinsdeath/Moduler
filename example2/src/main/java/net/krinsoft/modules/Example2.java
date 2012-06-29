package net.krinsoft.modules;

/**
 * @author krinsdeath
 */
public class Example2 {

    public static void main(String[] args) {
        Moduler moduler = new Moduler();
        Example2 example = new Example2();

        System.out.println("Starting " + moduler.getName() + " v" + moduler.getVersion() + " with " + example.getName());
    }

    public String getName() {
        return "Example2";
    }
}
