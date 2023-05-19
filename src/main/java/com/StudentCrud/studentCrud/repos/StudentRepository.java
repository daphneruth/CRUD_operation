package com.StudentCrud.studentCrud.repos;



import com.StudentCrud.studentCrud.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}