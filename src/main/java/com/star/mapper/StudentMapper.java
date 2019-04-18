package com.star.mapper;

import com.star.Utils.Record;
import com.star.vo.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface StudentMapper {
    @Select("select * from student")
    List<Student> findById(Integer id);

    List<Student> list();
    @Select("<script>"+
            "select *  from student s where  s.name like #{name}  <if test='age!=null'> and age =#{age} </if>"+
            "</script>")
    List<Record> all(@Param("name") String name,@Param("age") Integer age);
    @Select("select * from student")
    List<Map<String,String>> findAll();

    @Insert("insert into student(name,age,status) values(#{name},#{age},#{status})")
    Integer save(Student student);
}
