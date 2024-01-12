package repository;


import model.Student;

import java.util.List;

public interface IStudentRepository {
  List<Student> getList();

  void addStudent(Student student);

  void deleteStudent(List<String> stringList);

  void editStudent(List<String> stringList);

}
