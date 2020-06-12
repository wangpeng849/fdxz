package com.fii.fdxz.common.util;

import com.fii.fdxz.common.base.BasePO;
import sun.plugin2.jvm.RemoteJVMLauncher;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @Author wangp
 * @Date 2020/6/12
 * @Version 1.0
 */
public class BeanListUtils {

    public static <BO, PO> List<BO> coverToBoList(List<PO> source, Supplier<BO> target) {
        return coverToBoList(source, target, null);
    }

    public static <BO, PO> List<BO> coverToBoList(List<PO> source, Supplier<BO> target, BeanUtilsCallBack<PO,BO> callBack) {
        List<BO> boList = new ArrayList<>(source.size());
        for (PO po : source) {
            BO bo = target.get();
            BeanUtils.copyProperties(po, bo);
            boList.add(bo);
            if (callBack != null) {
                callBack.callback(po, bo);
            }
        }
        return boList;
    }
}
