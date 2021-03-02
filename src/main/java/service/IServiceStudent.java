package service;

import model.Student;

import java.util.List;

public interface IServiceStudent {
    List<Student>findAll();
    Student findById(int id);
    boolean update(Student student);
    boolean save(Student student,int id);

}
