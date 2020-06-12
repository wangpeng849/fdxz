package com.fii.fdxz.service.impl;

import com.fii.fdxz.common.util.BeanListUtils;
import com.fii.fdxz.mapper.GradeMapper;
import com.fii.fdxz.mapper.NoticeMapper;
import com.fii.fdxz.mapper.StudentMapper;
import com.fii.fdxz.pojo.bo.NoticeProfileInfoBo;
import com.fii.fdxz.pojo.po.GradeInfo;
import com.fii.fdxz.pojo.po.NoticeInfo;
import com.fii.fdxz.pojo.po.StudentInfo;
import com.fii.fdxz.service.NoticeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @Author wangp
 * @Date 2020/5/27
 * @Version 1.0
 */
@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;

    @Autowired
    private GradeMapper gradeMapper;

    @Autowired
    private StudentMapper studentMapper;

    public List<NoticeProfileInfoBo> queryNoticeByProfile() {
        List<NoticeInfo> noticeInfos = noticeMapper.queryNotice();
        List<NoticeProfileInfoBo> noticeInfoBos = BeanListUtils.coverToBoList(noticeInfos, NoticeProfileInfoBo::new);
        noticeInfoBos.forEach(bo -> {
            String gradeName = bo.getSendTo();
            //发送给班级的统计
            if (gradeName.startsWith("grade")) {
                String className = gradeName.split("_")[1];
                GradeInfo gradeInfo = gradeMapper.queryGradeByName(className);
                List<StudentInfo> allStudentList = studentMapper.queryStudentListByGradeName(className);
                String noticeId = bo.getId();
                List<StudentInfo> confirmStudent = noticeMapper.queryConfirmNoticeByGrade(1, gradeInfo.getId(), noticeId);
                bo.setProgress((double) confirmStudent.size() * 1d / allStudentList.size());
                bo.setConfirmStudent(confirmStudent.stream().map(StudentInfo::getName).collect(Collectors.toList()));
                allStudentList.removeAll(confirmStudent);
                bo.setNoConfirmStudent(allStudentList.stream().map(StudentInfo::getName).collect(Collectors.toList()));
            } else if (gradeName.startsWith("stu")) {
                String stuName = gradeName.split("_")[1];
                bo.setProgress(noticeMapper.queryConfirmNoticeByStudent(stuName));
            }
        });
        return noticeInfoBos;
    }
}
