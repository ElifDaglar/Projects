public class Phone extends ElectronicDevice {
    private String phoneNumber;

    public Phone(String make, double price, String phoneNumber) {
        super(make, price);
        this.phoneNumber = phoneNumber;
    }

    public void call(String phoneNumber) {
        if (isOpen()) {
            String oldNumber = getPhoneNumber();
            setPhoneNumber(phoneNumber);
            System.out.println(oldNumber + " numaralı telefon, " + getPhoneNumber() + " numarayı arıyor...");
        } else {
            System.out.println("Arama yapmak için telefonun açık olması gerekmektedir.");
        }

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
