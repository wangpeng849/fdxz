package com.fii.fdxz.mapper;

import com.fii.fdxz.pojo.po.NoticeInfo;
import com.fii.fdxz.pojo.po.StudentInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author wangp
 * @Date 2020/6/12
 * @Version 1.0
 */
@Mapper
public interface NoticeMapper {

    List<NoticeInfo> queryNotice();

    List<StudentInfo> queryConfirmNoticeByGrade(@Param("status") Integer status,
                                                @Param("gradeId") String gradeId,
                                                @Param("noticeId") String noticeId);
    Integer queryConfirmNoticeByStudent(@Param("stuName") String stuName);
}
