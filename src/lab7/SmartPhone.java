package lab7;

public class SmartPhone extends Phone {
    private final String IMEI;
    private final OperatingSystem operatingSystem;

    public SmartPhone(String BRAND, String IMEI, OperatingSystem operatingSystem) {
        super(BRAND);
        this.IMEI = IMEI;
        this.operatingSystem = operatingSystem;
    }

    public String getIMEI() {
        return IMEI;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "ID='"+ ID + '\'' +
                ", BRAND='" + BRAND + '\'' +
                ", IMEI='" + IMEI + '\'' +
                ", operatingSystem=" + operatingSystem +
                '}';
    }
}
