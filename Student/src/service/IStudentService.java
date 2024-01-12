package service;

public interface IStudentService {
    void addStudent();
    void displayStudent();

    void deleteStudent(int idDel);
    void findStudent(String nameFind);
    void editStudent(int idEdit);
}
