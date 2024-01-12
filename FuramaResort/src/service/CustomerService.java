package service;

import model.person.Customer;
import model.person.Employee;
import repository.CustomerRepository;
import repository.ICustomerRepository;
import utils.CheckInputData;
import utils.Validation;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static final String NAME_CUSTOMER_VALID = "^([A-Z][a-z]{1,})((\\s[A-Z][a-z]{1,}){1,})$";
    private static final String EMAIL_CUSTOMER_VALID = "^[a-zA-z0-9]+@gmail.com";
    private static final String ID_CUSTOMER_VALID = "^(KH)(-)\\d{4}$";
    private static final String DATEOFBIRTH_CUSTOMER_VALID = "^(0[1-9]|[12][0-9]|3[01])\\/(0[1-9]|1[0-2])\\/\\d{4}$";
    private static final String PHONENUMBER_CUSTOMER_VALID = "^0\\d{9}$";
    private static final String CMND_CUSTOMER_VALID = "^\\d{9}(?:\\d{3})?$";
    private ICustomerRepository customerRepository = new CustomerRepository();
    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
                String name = CheckInputData.checkInput("Mời bạn nhập tên của Customer:",NAME_CUSTOMER_VALID, "Tên không hợp lệ.Vui lòng nhập lại." );
                String sex = CheckInputData.checkInputSex("Mời bạn nhập sex của Customer:");
                String email = CheckInputData.checkInput("Mời bạn nhập email của Customer:", EMAIL_CUSTOMER_VALID, "Email không hợp lệ.Vui lòng nhập lại.");
                String id = CheckInputData.checkInput("Mời bạn nhập id của Customer:", ID_CUSTOMER_VALID, "Id không hợp lệ.Vui lòng nhập lại.");
                System.out.println("Nhập ngày sinh:");
                String dateOfBirth = scanner.nextLine();
                String phoneNumber = CheckInputData.checkInput("Mời bạn nhập số điện thoại của Customer:", PHONENUMBER_CUSTOMER_VALID, "Số điện thoại không hợp lệ.Vui lòng nhập lại.");
                String CMND = CheckInputData.checkInput("Mời bạn nhập số CMND của Customer:", CMND_CUSTOMER_VALID, "CMND không hợp lệ.Vui lòng nhập lại.");
                String address = CheckInputData.checkInputNull("Mời bạn nhập địa chỉ của Customer:", "address");
                String typeCustomer = CheckInputData.checkInputNull("Mời bạn nhập loại của Customer:", "type");
                Customer customer = new Customer(name, sex, email, id, dateOfBirth, phoneNumber, CMND, address, typeCustomer);
                customerRepository.add(customer);
                System.out.println("Đã thêm thành công.");

                String mess = "Bạn có mốn nhập nữa không?(Y/N)";
                if (Validation.confirm(mess)) {
                continue;
                } else {
                return;
                }
        }


    }

    @Override
    public void display() {
        List<Customer> customerList = customerRepository.getList();
        for (Customer cus : customerList) {
            System.out.println(cus.getInfoToCSV());
        }

    }

    @Override
    public void edit(String idEdit) {

    }

    @Override
    public void delete(String idDel) {

    }
}
