package Models;

public class CustomerInfo {
    private String customerName;
    private String customerEmail;
    private String customerCity;
    private String customerResidentNo;
    private int customerNumber;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerResidentNo() {
        return customerResidentNo;
    }

    public void setCustomerResidentNo(String customerResidentNo) {
        this.customerResidentNo = customerResidentNo;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public CustomerInfo(String customerName, String customerEmail, String customerCity, String customerResidentNo, int customerNumber) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerCity = customerCity;
        this.customerResidentNo = customerResidentNo;
        this.customerNumber = customerNumber;


    }
}

