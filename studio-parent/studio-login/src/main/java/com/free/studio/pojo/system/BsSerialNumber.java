package com.free.studio.pojo.system;

import java.util.Date;

public class BsSerialNumber {
    private Integer pid;

    private String serialCode;

    private String serialFormat;

    private String prefix;

    private String dateFormat;

    private String serialNoLength;

    private Integer curNo;

    private String creator;

    private Date createTime;

    private String modifier;

    private Date modifyTime;

    private String enterpriseCode;

    private String departmentCode;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getSerialCode() {
        return serialCode;
    }

    public void setSerialCode(String serialCode) {
        this.serialCode = serialCode == null ? null : serialCode.trim();
    }

    public String getSerialFormat() {
        return serialFormat;
    }

    public void setSerialFormat(String serialFormat) {
        this.serialFormat = serialFormat == null ? null : serialFormat.trim();
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix == null ? null : prefix.trim();
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat == null ? null : dateFormat.trim();
    }

    public String getSerialNoLength() {
        return serialNoLength;
    }

    public void setSerialNoLength(String serialNoLength) {
        this.serialNoLength = serialNoLength == null ? null : serialNoLength.trim();
    }

    public Integer getCurNo() {
        return curNo;
    }

    public void setCurNo(Integer curNo) {
        this.curNo = curNo;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode == null ? null : enterpriseCode.trim();
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode == null ? null : departmentCode.trim();
    }
}