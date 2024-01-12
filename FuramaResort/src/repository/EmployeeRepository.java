package repository;

import model.person.Employee;
import utils.ReadAndWriteFileToCSV;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository<Employee>{
    private ReadAndWriteFileToCSV readAndWriteFileToCSV = new ReadAndWriteFileToCSV();
    private final String EMPLOYEE_DATA = "D:\\Code\\Java\\Codegym\\FuramaResort\\src\\data\\employee.csv";
    @Override
    public void add(Employee employee) {
        List<String> stringList = new ArrayList<>();
        stringList.add(employee.getInfoToCSV());
        ReadAndWriteFileToCSV.writeToFile(EMPLOYEE_DATA, stringList, true);
    }

    @Override
    public void edit(List<String> stringList) {
        readAndWriteFileToCSV.writeToFile(EMPLOYEE_DATA, stringList, false);
    }

    @Override
    public void delete(List<String> stringList) {
        readAndWriteFileToCSV.writeToFile(EMPLOYEE_DATA, stringList, false);
    }


    @Override
    public List<Employee> getList() {
        List<String> stringList = readAndWriteFileToCSV.readFileCSV(EMPLOYEE_DATA);
        List<Employee> employeeList = new ArrayList<>();
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
            String level = array[7];
            String position = array[8];
            double salary = Double.parseDouble(array[9]);
            Employee employee = new Employee(name,sex, email,id, dateOfBirth, phoneNumber,CMND,level, position, salary);
            employeeList.add(employee);
        }
        return employeeList ;
    }

}
