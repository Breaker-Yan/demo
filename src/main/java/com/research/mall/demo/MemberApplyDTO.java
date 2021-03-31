package com.research.mall.demo;

import java.io.Serializable;

/**
 * @version 1.0
 * @description: 商家申请VO
 * @projectName：ihwdz-pop
 * @className：MemberApplyVO.java
 * @see: com.ihwdz.eac.web.sellMemberApply.vo
 * @author： yek
 * @createTime：2018年1月6日 12:15:23
 */
public class MemberApplyDTO implements Serializable {

    private static final long serialVersionUID = 7847402277094990930L;

    private Long id = 0L;

    private SellMemberApplyProductionInfo sellMemberApplyProductionInfo;       //下拉框即基本信息


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id == null ? 0 : id;
    }

    public SellMemberApplyProductionInfo getSellMemberApplyProductionInfo() {
        return sellMemberApplyProductionInfo;
    }

    public void setSellMemberApplyProductionInfo(SellMemberApplyProductionInfo sellMemberApplyProductionInfo) {
        this.sellMemberApplyProductionInfo = sellMemberApplyProductionInfo;
    }
}
