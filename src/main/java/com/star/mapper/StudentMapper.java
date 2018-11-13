package com.star.mapper;

import com.star.Utils.Record;
import com.star.vo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface StudentMapper {
    @Select("select * from student")
    List<Student> findById(Integer id);

    List<Student> list();
    @Select("select *,l.name as '爱好' from student s,love l where s.aihao=l.id")
    List<Record> all();
    @Select("select * from student")
    List<Map<String,String>> findAll();


}
