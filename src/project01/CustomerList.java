package project01;


import java.util.ArrayList;

public class CustomerList {
    private Customer[] customers;
    private int total = 0;

    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }


    public boolean addCustomer(Customer customer) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = customer;
                return true;
            }
        }
        return false;
    }


    public boolean replaceCustomer(int index, Customer cust) {
        if (index < 0 || index >= customers.length || customers[index] == null) {
            return false;
        } else {
            customers[index] = cust;
            return true;
        }
    }


    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= customers.length || customers[index] == null) {
            return false;
        } else {
            for (int i = index; i < customers.length - 1; i++) {
                customers[i] = customers[i + 1];
//                customers[i].setId(customers[i].getId()-1);
            }
            customers[customers.length - 1] = null;
        }
        return true;
    }


    public Customer[] getAllCustomers() {
        ArrayList<Customer> arrayList = new ArrayList<>();
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                break;
            }
            arrayList.add(customers[i]);
        }
        return arrayList.toArray(new Customer[arrayList.size()]);
    }

    public Customer getCustomer(int index) {
        if (index < 0 || index >= customers.length || customers[index] == null) {
            System.out.println("输入有误");
            return null;
        }
        return customers[index];
    }
}


