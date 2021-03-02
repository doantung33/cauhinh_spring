package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class SericeStudent implements IServiceStudent {
    private static ArrayList<Student>students=new ArrayList<>();
    static {
        students.add(new Student(1,"student1",19,"hd"));
        students.add(new Student(2,"student2",16,"hd"));
        students.add(new Student(3,"student3",20,"hd"));
        students.add(new Student(4,"student4",22,"hd"));
        students.add(new Student(5,"student5",11,"hd"));
    }
    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public Student findById(int id) {
        return students.get(id);
    }

    @Override
    public boolean update(Student student) {
        return false;
    }

    @Override
    public boolean save(Student student, int id) {
        students.set(id,student);
        return false;
    }
}
