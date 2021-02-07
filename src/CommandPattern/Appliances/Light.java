package CommandPattern.Appliances;

public class Light {
    private String name;
    public Light(String name) {
        this.name = name;
    }
    public void on() {
        System.out.println("Turning on light " + name);
    }
    public void off() {
        System.out.println("Turning off light " + name);
    }
}
