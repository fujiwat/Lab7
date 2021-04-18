package lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        {
//        PhoneStore store = new PhoneStore("MyShop");
//        store.add(new Phone("Philips"));
//        store.add(new Phone("Siemens"));
//        store.add(new SmartPhone("Panasonic", "IEMI001", OperatingSystem.ANDROID));
//        store.add(new SmartPhone("Casio", "IEMI002", OperatingSystem.ANDROID));
//        store.add(new SmartPhone("Apple", "IEMI003", OperatingSystem.IOS));
//        store.add(new SmartPhone("Apple", "IEMI004", OperatingSystem.IOS));
//        store.add(new Phone("Philips"));
//        store.add(new Phone("Siemens"));
//        store.add(new SmartPhone("Fujitsu", "IMEI005", OperatingSystem.ANDROID));
//        store.listSmartPhones();
//        System.out.println("** now remove ID=8");
//        store.remove(8);
//        store.listSmartPhones();
        }
        // test 4
        {
            System.out.println("----------------test 4");
            // Open the file
            Scanner scanner;
            String strLine;
            PhoneStore store = new PhoneStore("MyShop2");
            store.addPhones("lab7_1_input.csv");

//            try {
//                scanner = new Scanner(new File("lab7_1_input.csv"));
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//                return;
//            }
//            // read file
//            while (scanner.hasNextLine()) {
//                String brand, imei, operatingSystem;
//                String line = scanner.nextLine();
//                if (line.isEmpty()) {
//                    continue;
//                }
//                String[] items = line.split(",");
//                // trim: eliminates leading and trailing spaces
//                brand = (0 < items.length) ? items[0].trim() : "";
//                imei = (1 < items.length) ? items[1].trim() : "";
//                operatingSystem = (2 < items.length) ? items[2].trim() : "";
//                if (brand.equals("")) {
//                    // skip this line
//                    continue;
//                }
//                if (imei.equals("")) {
//                    // standard phone
//                    store.add(new Phone(brand));
//                } else {
//                    if (operatingSystem.equals("")) {
//                        // error no operatingSystem
//                    } else {
//                        store.add(new SmartPhone(brand, imei, OperatingSystem.valueOf(operatingSystem) ));
//                    }
//                }
//            }
//            scanner.close();
            store.listSmartPhones();
            System.out.println("Number os SmartPhones = " + store.numberOfSmartPhones());
            System.out.println("phone ID by IMEI='" + "IMEI1" + "' =" + store.phoneByImei("IMEI1"));
            System.out.println("phone ID by IMEI='" + "IMEI2" + "' =" + store.phoneByImei("IMEI2"));
            System.out.println("phone ID by IMEI='" + "IMEI3" + "' =" + store.phoneByImei("IMEI3"));
            System.out.println("phone ID by IMEI='" + "IMEI4" + "' =" + store.phoneByImei("IMEI4"));
            System.out.println("phone ID by IMEI='" + "IMEIxxxx" + "' =" + store.phoneByImei("IMEIxxxx"));
            System.out.println("Number of IOS=" + store.numberOfSmartPhones(OperatingSystem.IOS.getName()));
            System.out.println("Number of ANDROID=" + store.numberOfSmartPhones(OperatingSystem.ANDROID.getName()));
        }
    }
}
