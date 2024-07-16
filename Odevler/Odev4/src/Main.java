public class Main {
    public static void main(String[] args) {
        ElectronicDevice device1 = new Computer("Asus", 15000.00, "Windows 10");
        ElectronicDevice device2 = new Phone("Apple", 30000.00, "555-1234");
        device1.open();
        device2.open();

        System.out.println();

        System.out.println("Başlangıçta tanımlanan cihazlar taımlanan nesneler üzerinden erişiliyor:");
        System.out.println(device1.getMake() + " marka, " + device1.price + " fiyatında, " + ((Computer) device1).getOperatingSystem() + " işletim sistemine sahip bilgisayar.");
        System.out.println(device2.getMake() + " marka, " + device2.price + " fiyatında, " + ((Phone) device2).getPhoneNumber() + " telefon numarasına sahip telefon.");

        System.out.println();

        ((Computer) device1).updateOperatingSystem(((Computer) device1).getOperatingSystem());
        ((Computer) device1).setOperatingSystem("Windows 11");
        System.out.println("İşletim sistemi " + ((Computer) device1).getOperatingSystem() + " olarak güncellendi.");
        ((Phone) device2).call("555-5678");

        device1.close();
        device2.close();



    }
}