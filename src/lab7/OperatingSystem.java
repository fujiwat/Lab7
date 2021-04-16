package lab7;

public enum OperatingSystem {
    IOS ("IOS",1),
    ANDROID ("ANDROID"),  // omitted the number
    OTHER ( "OTHER");             // omitted the number

    private String name;
    private int value;
    private int nextValue = 0;

    OperatingSystem(String name, int value) {
        this.name = name;
        this.value = value;
        this.nextValue = this.value+1;
    }

    OperatingSystem(String name) {
        // case of value is omitted. -- auto increment
//        this( name, nextValue); // error!!!  I can not solve this.  so the code is copied from the constructor
        this.name = name;
        this.value = nextValue;
        this.nextValue = this.value+1;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
