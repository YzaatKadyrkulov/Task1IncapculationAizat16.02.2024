import java.util.Arrays;

public class Phone {
    private String brand;
    private String modal;
    private int price;
    private String phoneUserName;
    private static Contact[] contacts;
public Phone(){

}
    public Phone(String brand, String modal, int price, String phoneUserName, Contact[] contacts) {
        this.brand = brand;
        this.modal = modal;
        this.price = price;
        this.phoneUserName = phoneUserName;
        this.contacts = contacts;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModal() {
        return modal;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPhoneUserName() {
        return phoneUserName;
    }

    public void setPhoneUserName(String phoneUserName) {
        this.phoneUserName = phoneUserName;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    public  void getAllContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);

        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", modal='" + modal + '\'' +
                ", price=" + price +
                ", phoneUserName='" + phoneUserName + '\'' +
                ", contacts=" + Arrays.toString(contacts) +
                '}';
    }
}
