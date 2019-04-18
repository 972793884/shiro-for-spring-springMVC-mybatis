package com.star.service;

import com.star.Utils.Record;
import com.star.vo.Student;

import java.util.List;

public interface StudentService {

    List<Student> findById(Integer id);

    List<Record> all(String name, Integer age);

    List<Record> findAll();

    Integer save(Student student);
}
