package com.star.service.Impl;

import com.star.Utils.Record;
import com.star.config.MyResultHandler;
import com.star.mapper.StudentMapper;
import com.star.service.StudentService;
import com.star.vo.Student;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    SqlSessionTemplate sqlSessionTemplate;
    @Autowired
    MyResultHandler myResultHandler1;
    @Override
    public List<Student> findById(Integer id) {
        return studentMapper.findById(1);
    }

    public List<Record> all(String name, Integer age) {
        if (name!=null){
            name="%"+name+"%";
        }
        return studentMapper.all(name,age);
    }

    @Override
    public List<Record> findAll() {
        MyResultHandler myResultHandler = new MyResultHandler();
        sqlSessionTemplate.select(StudentMapper.class.getName() + ".findAll", myResultHandler);
        List<Record> result = myResultHandler.getResultMap();
        return result;
    }

    @Override
    public Integer save(Student student) {
        return studentMapper.save(student);
    }


}
