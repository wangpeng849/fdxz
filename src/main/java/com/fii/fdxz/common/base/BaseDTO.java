package com.fii.fdxz.common.base;

import com.fii.fdxz.common.util.BeanUtils;

/**
 * @author Anthony
 * @date 2019/11/5
 */
public abstract class BaseDTO {

    public <PO> PO covertToPo(PO po) {
        BeanUtils.copyProperties(this, po);
        return po;
    }

    public <PO> PO covertToPoIgnoreNull(PO po) {
        BeanUtils.copyPropertiesIgnoreNull(this, po);
        return po;
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
