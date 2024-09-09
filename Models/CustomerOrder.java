package Models;

import java.util.ArrayList;

public class CustomerOrder {
    private CustomerInfo customerDetails;
    private ArrayList<BookOrder> orderedBooks;

    public CustomerInfo getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails() {
        this.customerDetails = customerDetails;
    }

    public ArrayList<BookOrder> getOrderedBooks() {
        return orderedBooks;
    }

    public void setOrderedBooks(ArrayList<BookOrder> orderedBooks) {
        this.orderedBooks = orderedBooks;
    }

    public CustomerOrder(CustomerInfo customerDetails, ArrayList<BookOrder> orderedBooks) {
        this.customerDetails = customerDetails;
        this.orderedBooks = orderedBooks;


    }

    public float calculateTotalAmount() {
    }
