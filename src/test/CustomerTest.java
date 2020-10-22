package src.test;

import src.domain.Customer;

public class CustomerTest {
    
    public static void main(String args[])
    {
        Customer customer = new Customer();
        
        customer.displayCustomerInfo();
        
        customer.setID(-100);
        
        customer.setIsNew(false);
        
        customer.setTotal(1000.999F);
        
        System.out.println("After change:");
        customer.displayCustomerInfo();
    }
}
