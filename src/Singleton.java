public class Singleton {
    private static Singleton instance = null;
    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println("Ссылаются ли они на один объект? " + (instance1 == instance2));
    }
}
