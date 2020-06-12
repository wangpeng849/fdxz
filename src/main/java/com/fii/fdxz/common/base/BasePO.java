package com.fii.fdxz.common.base;


import com.fii.fdxz.common.util.BeanUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Anthony
 * @date 2019/11/5
 * PO类基类
 * @since mybatis-starter1.3.2 {@link LocalDateTime}
 */
public abstract class BasePO {

    public <DTO> DTO convertToDto(DTO dto) {
        BeanUtils.copyProperties(this, dto);
        return dto;
    }

    public <DTO> DTO convertToDtoIgnoreNull(DTO dto) {
        BeanUtils.copyPropertiesIgnoreNull(this, dto);
        return dto;
    }

    public <BO> BO covertToBo(BO bo) {
        BeanUtils.copyProperties(this, bo);
        return bo;
    }

    public <BO> BO covertToBoIgnoreNull(BO bo) {
        BeanUtils.copyPropertiesIgnoreNull(this, bo);
        return bo;
    }
}
