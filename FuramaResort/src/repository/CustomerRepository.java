package repository;

import model.person.Employee;
import utils.ReadAndWriteFileToCSV;
import model.person.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository<Customer>{
    private final String CUSTOMER_DATA = "D:\\Code\\Java\\Codegym\\FuramaResort\\src\\data\\customer.csv";
    private ReadAndWriteFileToCSV readAndWriteFileToCSV = new ReadAndWriteFileToCSV();
    @Override
    public List<Customer> getList() {
        List<String> stringList = readAndWriteFileToCSV.readFileCSV(CUSTOMER_DATA);
        List<Customer> customerList = new ArrayList<>();
        String[] array = null;
        for (String s: stringList) {
            array = s.split(",");
            String name = array[0];
            String sex = array[1];
            String email = array[2];
            String id = array[3];
            String dateOfBirth = array[4];
            String phoneNumber = array[5];
            String CMND = array[6];
            String address = array[7];
            String typeCustomer = array[8];
            Customer customer = new Customer(name,sex, email,id, dateOfBirth, phoneNumber,CMND,address, typeCustomer);
            customerList.add(customer);
        }
        return customerList ;
    }

    @Override
    public void add(Customer customer) {
        List<String> stringList = new ArrayList<>();
        stringList.add(customer.getInfoToCSV());
        ReadAndWriteFileToCSV.writeToFile(CUSTOMER_DATA, stringList, true);
    }

    @Override
    public void edit(List<String> stringList) {

    }

    @Override
    public void delete(List<String> stringList) {

    }

}
