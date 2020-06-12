package com.fii.fdxz.pojo.po;

import com.fii.fdxz.common.base.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @Author wangp
 * @Date 2020/5/26
 * @Version 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class StudentInfo extends BaseDTO {
    private String id;
    private String name;
    private String studyNumber;
    private Integer age;
    private String sex;
    private String phone;
    private String password;
    private Integer status;
    private String counselorId;
    private String type;
    private String grade;
    private String college;
    private String school;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentInfo that = (StudentInfo) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
