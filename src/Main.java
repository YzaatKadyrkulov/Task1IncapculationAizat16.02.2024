
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * 1. Contact класс, поля(contactName, phoneNumber).
         *       2. Phone класс, поля:  brand, model, price, phonesUserName,
         * contacts[]) .
         *       3. В классе Phone создайте метод getContactCount();
         *       Пусть этот метод выведет все контакты данного абонента и
         * имя абонента
         *       4. В main создайте обьекты и массивы классов Contact и
         * Phone.
         *      5. Вызовите метод getContactCount() у каждого абонента
         * (обьекта класса Phone)
         */

        Contact contact1 = new Contact();
        contact1.setContactName("Yzaat");
        contact1.setPhoneNumber("12344234");

        Contact contact2 = new Contact();
        contact2.setContactName("Nazima");
        contact2.setPhoneNumber("123442244");

        Contact[] contacts = {contact1,contact2};

        Phone phone1 = new Phone();
        phone1.setBrand("Iphone");
        phone1.setModal("Iphone8");
        phone1.setPrice(234);
        phone1.setPhoneUserName("Eldyar");
        phone1.setContacts(contacts);

        Phone phone2 = new Phone();
        phone1.setBrand("Iphone");
        phone1.setModal("Iphone8");
        phone1.setPrice(234);
        phone1.setPhoneUserName("Eldyar");
        phone1.setContacts(contacts);

        Phone[] phones = {phone1,phone2};
        System.out.println("phone1.getBrand() = " + phone1.getBrand());
        System.out.println("phone1.getModal() = " + phone1.getModal());
        System.out.println("phone1.getPrice() = " + phone1.getPrice());
        System.out.println("phone1.getPhoneUserName() = " + phone1.getPhoneUserName());

        phone1.getAllContacts();
    }
}