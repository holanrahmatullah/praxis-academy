
package latihan;

import java.util.Scanner;
import latihan.satu.*;
import latihan.dua.JavaDomParser.JavaDomMenu;
import latihan.dua.JavaSaxParser.JavaSaxMenu;
import latihan.tiga.*;

public class App {

    private static void pilihTiga() {
        int pilihan, back, exit; 
        Scanner scan = new Scanner(System.in);
        System.out.println("======================================================");
        System.out.println("JSON with Java");
        System.out.println("======================================================");
        System.out.println("Silahkan pilih program yang akan dijalankan");
        System.out.println("[1] JSON Encoder example");
        System.out.println("[2] JSON Decoder example");
        System.out.println("[3] Back");
        System.out.println("[4] Exit");
        pilihan = scan.nextInt();

        switch (pilihan) {
            case 1:
                JsonEncodeDemo o1 = new JsonEncodeDemo();
                o1.mulai();
                pilihTiga();
                break;
            case 2:
                JsonDecodeDemo o2 = new JsonDecodeDemo();
                o2.mulai();
                pilihTiga();
                break;
            case 3:
                menu();
                break;
            case 4:
                System.out.println("..:: Terima Kasih ::..");
                System.exit(0);
                break;
            default:
                break;
        }
    }

    private static void pilihSatu() {
        int pilihan, back, exit; 
        Scanner scan = new Scanner(System.in);
        System.out.println("======================================================");
        System.out.println("Serialization and Deserialization in Java with Example");
        System.out.println("======================================================");
        System.out.println("Silahkan pilih program yang akan dijalankan");
        System.out.println("[1] Example 1");
        System.out.println("[2] Example 2");
        System.out.println("[3] Back");
        System.out.println("[4] Exit");
        pilihan = scan.nextInt();

        switch (pilihan) {
            case 1:
                Test oTest = new Test();
                oTest.mulai();
                pilihSatu();
                break;
            case 2:
                SerialExample oSE = new SerialExample();
                oSE.mulai();
                pilihSatu();
                break;
            case 3:
                menu();
                break;
            case 4:
                System.out.println("..:: Terima Kasih ::..");
                System.exit(0);
                break;
            default:
                break;
        }
    }

    public static void pilihDua() {
        int pilihan, back, exit; 
        Scanner scan = new Scanner(System.in);
        System.out.println("======================================================");
        System.out.println("Java XML Tutorial");
        System.out.println("======================================================");
        System.out.println("Silahkan pilih program yang akan dijalankan");
        System.out.println("[1] Java DOM Parser Demo");
        System.out.println("[2] Java SAX Parser Demo");
        System.out.println("[3] Java JDOM Parser Demo");
        System.out.println("[4] Java StAX Parser Demo");
        System.out.println("[5] Java XPath Parser Demo");
        System.out.println("[6] Java DOM4J Parser Demo");
        System.out.println("[7] Back");
        System.out.println("[8] Exit");
        pilihan = scan.nextInt();

        switch (pilihan) {
            case 1:
                JavaDomMenu o1 = new JavaDomMenu();
                o1.mulai();
                break;
            case 2:
                JavaSaxMenu o2 = new JavaSaxMenu();
                o2.mulai();
                break;
            case 3:
                System.out.println("Java JDOM Parser Demo(Coming soon)");
                break;
            case 4:
                System.out.println("Java StAX Parser Demo(Coming soon)");
                break;
            case 5:
                System.out.println("Java XPath Parser Demo(Coming soon)");
                break;
            case 6:
                System.out.println("Java DOM4J Parser Demo(Coming soon)");
                break;
            case 7:
                menu();
                break;
            case 8:
                System.out.println("..:: Terima Kasih ::..");
                System.exit(0);
            default:
                System.out.println("Angka yang Anda input tidak valid");
                break;
        }
    }

    public static void menu() {
        int pilih;
        int keluar = 0;
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.println("\n======================================================");
            System.out.println("Latihan minggu pertama hari ke-5");
            System.out.println("======================================================");
            System.out.println("Silahkan pilih program yang akan dijalankan");
            System.out.println("[1] Serialization and Deserialization in Java with Example");
            System.out.println("[2] Java XML Tutorial");
            System.out.println("[3] JSON with Java");
            System.out.println("[4] Java Data Structures");
            System.out.println("[5] 6 Data Structures Every Java Programmer Should Know");
            System.out.println("[6] Java Collections Framework");
            System.out.println("[7] Exit");
            pilih = scan.nextInt();
            switch (pilih) {
                case 1:
                    pilihSatu();
                    break;
                case 2:
                    pilihDua();
                    break;
                case 3:
                    pilihTiga();
                    break;
                case 4:
                    System.out.println("Java Data Structures(Coming soon)");
                    break;
                case 5:
                    System.out.println("6 Data Structures Every Java Programmer Should Know(Coming soon)");
                    break;
                case 6:
                    System.out.println("Java Collections Framework(Coming soon)");
                    break;
                case 7:
                    System.out.println("..:: Terima Kasih ::..");
                    System.exit(0);
                    break;
                default:
                    break;
            }    
        } while (keluar == 0);
        
    }

    public static void main(String[] args) {
            menu();    
        
    }
}