package lab7;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class PhoneStore {
    private String name;
    private ArrayList<Phone> phones = new ArrayList<>();

    public PhoneStore(String name) {
        this.name = name;
    }

    public void add(Phone phone) {
        // smartphone and standard phone
        phones.add(phone);
    }
    public void add(String brand) {
        // standard phone
        phones.add(new Phone(brand));
    }
    public void remove(Phone phone) {
        phones.remove(phone);
    }
    public void remove(int id) {
        phones.remove(id-1);
    }

    public void listSmartPhones() {
        System.out.println("SmartPhones: ");
        for (Phone p: phones) {
            if ( p instanceof SmartPhone ) {
                System.out.println(p);
            }
        }
    }

    public int numberOfSmartPhones() {
        int count = 0;
        for (Phone p: phones) {
            if ( p instanceof SmartPhone ) {
                count++;
            }
        }
        return count;
    }

    public int numberOfSmartPhones(String operatingSystem) {
        int count = 0;
        for (Phone p: phones) {
            if ( p instanceof SmartPhone ) {
                if ( ((SmartPhone) p).getOperatingSystem().getName().equals(operatingSystem)) {
                    count++;
                }
            }
        }
        return count;
    }
    public int phoneByImei(String imei ) {
        for (Phone p: phones) {
            if ( p instanceof SmartPhone ) {
                if ( ((SmartPhone) p).getIMEI().equals(imei) ) {
                    // found the phone
                    return p.getID();
                }
            }
        }
        return 0;
    }

    public String getName() {
        return name;
    }
}
