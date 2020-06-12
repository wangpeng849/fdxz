package com.fii.fdxz.mapper;

import com.fii.fdxz.pojo.po.RoleInfo;
import com.fii.fdxz.pojo.po.StudentInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author wangp
 * @Date 2020/5/26
 * @Version 1.0
 */
@Mapper
public interface StudentMapper {
    List<StudentInfo> queryStudentList();
    StudentInfo queryUserByStudyNumber(@Param("studyNumber") String studyNumber);
    RoleInfo queryRoleByStudentId(@Param("userId") String userId);
    List<StudentInfo> queryStudentListByGradeName(@Param("gradeName") String gradeName);
}
