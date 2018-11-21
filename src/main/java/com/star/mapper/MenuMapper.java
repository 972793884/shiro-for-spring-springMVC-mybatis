package com.star.mapper;

import com.star.Utils.Record;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MenuMapper {
    @Select("select m.* ,(select a.name from menu a where a.id=m.parent_id) pname from menu m")
    List<Record> getAll();
}
