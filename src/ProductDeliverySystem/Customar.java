package ProductDeliverySystem;

public class Customar {

    private String customarName;
    private String phoneNumber;
    private String email;
    private String paymentMethod;
    private Address address;

    public Customar(String customarName,String phoneNumber,String email, String paymentMethod, Address address) {
        this.customarName = customarName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.paymentMethod = paymentMethod;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCustomarName(String customarName) {
        this.customarName = customarName;
    }

    public String getCustomarName() {
        return customarName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
}
