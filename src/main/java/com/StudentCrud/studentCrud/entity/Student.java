package com.StudentCrud.studentCrud.entity;


       import jakarta.persistence.Entity;
        import jakarta.persistence.GeneratedValue;
        import jakarta.persistence.GenerationType;
        import jakarta.persistence.Id;
        import lombok.Data;




@Data
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sno;
    private String stdName;
    private String stdClass;
    private String schoolName;
}