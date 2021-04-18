package lab7;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


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

    public void addPhones( String filename ){
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filename));
        }catch( FileNotFoundException e){
            e.printStackTrace();
            return;
        }
        while( scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] items = line.split(",");
            if( items.length == 1 ){
                phones.add( new Phone( items[0].trim()));
            }else{
                OperatingSystem os = OperatingSystem.valueOf(items[2].trim());
                phones.add( new SmartPhone(items[0].trim(), items[1].trim(), os));
            }
        }
        scanner.close();
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
