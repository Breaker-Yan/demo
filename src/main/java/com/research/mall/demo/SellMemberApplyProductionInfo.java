package com.research.mall.demo;

import java.io.Serializable;

/**
 * @className: MemberApplyBaseInfoStr
 * @description:
 * @author: yanchenyang
 * @date: 2021/3/19
 **/
public class SellMemberApplyProductionInfo implements Serializable {

    private String capacityStr = ""; // 产能
    private Integer yearSaleStr = 0;

    public String getCapacityStr() {
        return capacityStr;
    }

    public void setCapacityStr(String capacityStr) {
        this.capacityStr = capacityStr;
    }

    public Integer getYearSaleStr() {
        return yearSaleStr;
    }

    public void setYearSaleStr(Integer yearSaleStr) {
        this.yearSaleStr = yearSaleStr;
    }
}
