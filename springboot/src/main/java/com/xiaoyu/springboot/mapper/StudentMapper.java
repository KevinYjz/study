package com.xiaoyu.springboot.mapper;

import com.xiaoyu.springboot.entity.Student;
import org.springframework.stereotype.Repository;

/**
 * @Description 学生dao层
 * @Author yujiazhen
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/1/24
 */
@Repository
public interface StudentMapper {

    /**
     * 通过学生id查询学生
     * @param id
     * @return
     */
    Student getStudnetById(String id);

}
