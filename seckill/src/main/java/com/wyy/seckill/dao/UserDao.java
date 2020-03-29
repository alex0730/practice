package com.wyy.seckill.dao;

import com.wyy.seckill.model.dto.userDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * <p> Description: [描述]</p>
 * Copyright (c) 2017年 北京柯莱特科技有限公司
 * Created on: 2020/3/29 16:16
 *
 * @author <a href="mailto: wuyingya@camelotchina.com">吴迎亚</a>
 * @version 1.0
 */
@Mapper
@Component
public interface UserDao {
    @Select("select * from user where id = #{id}")
    userDto getById(int id);

    @Insert("insert into user(id,name) values(#{id},#{name})")
    int insert(userDto user);
}
