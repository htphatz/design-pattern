package singleton;

public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
        // Private constructor to prevent instantiation
    }

    public static EagerInitializedSingleton getInstance() {
        return INSTANCE;
    }
}
