package SingletonPattern;

/**
 * The Singleton Pattern ensures a class has only one instance, and provides a global point
 * of access to it
 */
public class Main {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
