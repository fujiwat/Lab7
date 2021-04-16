package lab7;

public class Phone {
    protected final int ID;
    protected final String BRAND;
    private static int counter = 0;

    public Phone(String BRAND) {
        this.ID = ++counter;
        this.BRAND = BRAND;
    }

    public int getID() {
        return ID;
    }

    public String getBRAND() {
        return BRAND;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "ID=" + ID +
                ", BRAND='" + BRAND + '\'' +
                '}';
    }
}
