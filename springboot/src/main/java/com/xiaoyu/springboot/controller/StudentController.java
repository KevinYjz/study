package com.xiaoyu.springboot.controller;

import com.xiaoyu.springboot.entity.Student;
import com.xiaoyu.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 学生controller
 * @Author yujiazhen
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/1/24
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/getStudent/{id}")
    public Student getStudentById(@PathVariable String id) {
        return studentService.getStudentById(id);
    }
}
