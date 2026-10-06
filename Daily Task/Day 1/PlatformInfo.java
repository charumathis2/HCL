
public class PlatformInfo {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        System.out.println("Java Version: " +
                System.getProperty("java.version"));

        System.out.println("OS Name: " +
                System.getProperty("os.name"));

        System.out.println("Processors: " +
                runtime.availableProcessors());

        System.out.println("Maximum Heap: " +
                runtime.maxMemory());

        System.out.println("Free Heap: " +
                runtime.freeMemory());
    }
}
