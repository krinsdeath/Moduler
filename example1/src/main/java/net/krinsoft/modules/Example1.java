package net.krinsoft.modules;

/**
 * @author krinsdeath
 */
public class Example1 {

    public static void main(String[] args) {
        Moduler moduler = new Moduler();
        Example1 example = new Example1();

        System.out.println("Starting " + moduler.getName() + " v" + moduler.getVersion() + " with " + example.getName());
    }

    public String getName() {
        return "Example1";
    }

}
