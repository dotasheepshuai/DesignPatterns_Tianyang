package DecoratorPattern;

public abstract class Beverage {
    public enum Size { TALL, GRANDE, VENTI }
    private Size size = Size.TALL;

    public abstract String getDescription();
    public abstract double getCost();
    public void setSize(Size size) {
        this.size = size;
    }
    public Size getSize() {
        return size;
    }
}
