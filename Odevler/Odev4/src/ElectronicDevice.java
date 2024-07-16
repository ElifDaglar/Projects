public class ElectronicDevice {
    protected String make;
    protected double price;
    private boolean status;

    public ElectronicDevice(String make, double price) {
        this.make = make;
        this.price = price;
    }
    public void open() {
        if (status) {
            System.out.println("Cihaz zaten açık.");
        }
        status = true;
        System.out.println(getMake() + " cihaz açıldı.");

    }

    public void close() {
        if (!status) {
            System.out.println("Cihaz zaten kapalı.");
        }
        status = false;
        System.out.println(getMake() + " cihaz kapatıldı.");


    }

    public void setOpen(boolean status) {

    }

    public double getPrice(double price) {
        return price;
    }

    public void setPrice(double price) {

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {

    }

    public boolean isOpen() {
        return status;
    }
}
