public class Computer extends ElectronicDevice {
    private String operatingSystem;

    public Computer(String make, double price, String operatingSystem) {
        super(make, price);
        this.operatingSystem = operatingSystem;
    }

    public void updateOperatingSystem(String operatingSystem) {
        if (!isOpen()) {
            System.out.println("İşletim sistemi güncelleme işlemi için cihaz açık olmalı");
        } else {
            System.out.println("İşletim sistemi güncelleniyor...");
        }
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }


}
