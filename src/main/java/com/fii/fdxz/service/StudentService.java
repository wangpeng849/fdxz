package com.fii.fdxz.service;

import com.fii.fdxz.pojo.bo.StudentInfoBo;

import java.util.List;

/**
 * @Author wangp
 * @Date 2020/5/26
 * @Version 1.0
 */
public interface StudentService {
    List<StudentInfoBo> queryStudentList();
}
