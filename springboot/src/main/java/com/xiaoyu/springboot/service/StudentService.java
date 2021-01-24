package com.xiaoyu.springboot.service;

import com.xiaoyu.springboot.entity.Student;

/**
 * @Description 学生service类
 * @Author yujiazhen
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/1/24
 */
public interface StudentService {

    Student getStudentById(String id);
}
