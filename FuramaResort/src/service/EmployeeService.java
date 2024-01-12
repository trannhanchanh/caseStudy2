package service;

import model.person.Employee;
import repository.EmployeeRepository;
import repository.IEmployeeRepository;
import utils.CheckInputData;
import utils.Validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class EmployeeService implements IEmployeeService{
    private static final String NAME_EMPLOYEE_VALID = "^([A-Z][a-z]{1,})((\\s[A-Z][a-z]{1,}){1,})$";
    private static final String EMAIL_EMPLOYEE_VALID = "^[a-zA-z0-9]+@gmail.com";
    public static final String ID_EMPLOYEE_VALID = "^(NV)(-)\\d{4}$";
    private static final String DATEOFBIRTH_EMPLOYEE_VALID = "^(0[1-9]|[12][0-9]|3[01])\\/(0[1-9]|1[0-2])\\/\\d{4}$";
    private static final String PHONENUMBER_EMPLOYEE_VALID = "^0\\d{9}$";
    private static final String CMND_EMPLOYEE_VALID = "^\\d{9}(?:\\d{3})?$";
    private IEmployeeRepository employeeRepository = new EmployeeRepository();


    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
           String name = CheckInputData.checkInput("Mời bạn nhập tên của Employee:",NAME_EMPLOYEE_VALID, "Tên không hợp lệ.Vui lòng nhập lại." );
           String sex = CheckInputData.checkInputSex("Mời bạn nhập sex của Employee:");
           String email = CheckInputData.checkInput("Mời bạn nhập email của Employee:", EMAIL_EMPLOYEE_VALID, "Email không hợp lệ.Vui lòng nhập lại.");
           String id = CheckInputData.checkInput("Mời bạn nhập id của employee:", ID_EMPLOYEE_VALID, "Id không hợp lệ.Vui lòng nhập lại.");
           System.out.println("Nhập ngày sinh:");
           String dateOfBirth = scanner.nextLine();
           String phoneNumber = CheckInputData.checkInput("Mời bạn nhập số điện thoại của Employee:", PHONENUMBER_EMPLOYEE_VALID, "Số điện thoại không hợp lệ.Vui lòng nhập lại.");
           String CMND = CheckInputData.checkInput("Mời bạn nhập số CMND của Employee:", CMND_EMPLOYEE_VALID, "CMND không hợp lệ.Vui lòng nhập lại.");
           String level = CheckInputData.checkInputLevel("Mời bạn nhập level của Employee:");
           String position = CheckInputData.checkInputPosition("Mời bạn nhập position của Employee:");
           double salary = CheckInputData.checkInputMoney("Mời bạn nhập tiền lương của Employee:", 0);
           Employee employee= new Employee(name, sex, email, id, dateOfBirth, phoneNumber, CMND, level, position, salary);
           employeeRepository.add(employee);
            System.out.println("Đã thêm thành công.");
            String mess = "Bạn có muốn thêm nữa không?(Y/N)";
            if (Validation.confirm(mess)) {
                continue;
            } else {
                return;
            }


        }
    }

    @Override
    public void display() {

        List<Employee> employeeList = employeeRepository.getList();
        for (Employee e : employeeList) {
            System.out.println(e.toString());
        }
    }

    @Override
    public void edit(String idEdit) {
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        List<Employee> employeeList = employeeRepository.getList();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equalsIgnoreCase(idEdit)) {
                flag = true;
                System.out.println("Đã tìm thấy Employee.");
                while (true) {
                    System.out.println("1.Sửa tên Employee.");
                    System.out.println("2.Sửa giới tính của Employee.");
                    System.out.println("3.Sửa email của Employee.");
                    System.out.println("4.Sửa ngày sinh của Employee.");
                    System.out.println("5.Sửa số điện thoại của Employee.");
                    System.out.println("6.Sửa CMND của Employee");
                    System.out.println("7.Sửa level của Employee.");
                    System.out.println("8.Sửa position của Employee.");
                    System.out.println("9.Sửa tiền lương của Employee.");
                    int option = CheckInputData.CheckInputOption("\nMời bạn nhập thông tin cần sửa: " , 1, 9);
                    switch (option) {
                        case 1: {
                            employeeList.get(i).setName(CheckInputData.checkInput("Mời bạn sửa tên:", NAME_EMPLOYEE_VALID, "Tên không hợp lệ.Vui lòng nhập lại."));
                            break;
                        }
                        case 2: {
                            employeeList.get(i).setSex(CheckInputData.checkInputSex("Mời bạn sửa giới tính:"));
                            break;
                        }
                        case 3: {
                            employeeList.get(i).setEmail(CheckInputData.checkInput("Mời bạn sửa Email:", EMAIL_EMPLOYEE_VALID, "Email không hợp lệ.Vui lòng nhập lại."));
                            break;
                        }
                        case 4: {
                            System.out.println("Mời bạn sửa ngày sinh:");
                            employeeList.get(i).setDateOfBirth(scanner.nextLine());
                            break;
                        }
                        case 5: {
                            employeeList.get(i).setPhoneNumber(CheckInputData.checkInput("Mời bạn sửa số điện thoại:", PHONENUMBER_EMPLOYEE_VALID, "Số điện thoại không hợp lệ.Vui lòng nhập lại."));
                            break;
                        }
                        case 6: {
                            employeeList.get(i).setCMND(CheckInputData.checkInput("Mời bạn sửa số CMND:", CMND_EMPLOYEE_VALID, "CMND không hợp lệ.Vui lòng nhập lại."));
                            break;
                        }
                        case 7: {
                            employeeList.get(i).setLevel(CheckInputData.checkInputLevel("Mời bạn sửa trình độ:"));
                            break;
                        }
                        case 8: {
                            employeeList.get(i).setPosition(CheckInputData.checkInputPosition("Mời bạn sửa vị trí:"));
                            break;
                        }
                        case 9:{
                            employeeList.get(i).setSalary(CheckInputData.checkInputMoney("Mời bạn sửa tiền lương:", 0));
                        }
                    }

                    System.out.println("Đã chỉnh sửa thành công.");
                    String mess = "Bạn có muốn sửa thêm thông tin nào nữa không(Y/N)?";
                    if (Validation.confirm(mess)) {
                        continue;
                    } else {
                        break;
                        // return là kêết thúc toàn bộ hàm.
                    }
                }
            }
        }
        for (Employee e: employeeList) {
            stringList.add(e.getInfoToCSV());
        }
        employeeRepository.edit(stringList);
        if (!flag) {
            System.out.println("Không tìm Employee.");
        }


    }

    @Override
    public void delete(String idDel) {
        List<Employee> employeeList = employeeRepository.getList();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++) {
            if (!employeeList.get(i).getId().equals(idDel)) {
                stringList.add(employeeList.get(i).getInfoToCSV());
            }
        }
        String mess = "Bạn có muốn chắc chắn xóa không?(Y/N)";
        if (Validation.confirm(mess)) {
            employeeRepository.delete(stringList);
            if (employeeList.size() != stringList.size()) {
                System.out.println("Đã xóa thành công.");
            } else{
                System.out.println("Không tìm Employee tương ứng.");
            }
        } else {
            return;
        }


        }
    }


