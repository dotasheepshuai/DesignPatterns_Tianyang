package SingletonPattern;

class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Calling new...");
    }

    static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
