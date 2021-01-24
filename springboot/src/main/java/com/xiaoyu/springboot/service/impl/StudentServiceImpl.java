package com.xiaoyu.springboot.service.impl;

import com.xiaoyu.springboot.entity.Student;
import com.xiaoyu.springboot.mapper.StudentMapper;
import com.xiaoyu.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 学生service实现类
 * @Author yujiazhen
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/1/24
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student getStudentById(String id) {
        return studentMapper.getStudnetById(id);
    }
}
