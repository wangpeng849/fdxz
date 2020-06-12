package com.fii.fdxz.service.impl;

import com.fii.fdxz.mapper.StudentMapper;
import com.fii.fdxz.pojo.bo.StudentInfoBo;
import com.fii.fdxz.pojo.po.StudentInfo;
import com.fii.fdxz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wangp
 * @Date 2020/5/26
 * @Version 1.0
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<StudentInfoBo> queryStudentList() {
        List<StudentInfo> studentInfos = studentMapper.queryStudentList();
        List<StudentInfoBo> studentInfoBos = new ArrayList<>();
        for (StudentInfo studentInfo : studentInfos) {
            StudentInfoBo bo = new StudentInfoBo();
            studentInfo.covertToBo(bo);
            studentInfoBos.add(bo);
        }
        return studentInfoBos;
    }
}
