package com.fii.fdxz.mapper;

import com.fii.fdxz.pojo.po.GradeInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author wangp
 * @Date 2020/6/12
 * @Version 1.0
 */
@Mapper
public interface GradeMapper {
    GradeInfo queryGradeByName(@Param("gradeName")String gradeName);
}
