package com.yy.mybatis.domain;

import java.util.Date;
import java.util.Objects;

/**
 * 单项基本信息
 */
public class TSscBasicSinglePro {
    private String id;

    private String proCode;

    private String singleCode;

    private String singleName;

    private String singleType;

    private String lineLength;

    private String subsCapacity;

    private String voltageLevel;

    private String preType;

    private String manageUnit;

    private String buildScale;

    private String manageUnitCode;

    private Date startDate;

    private Date productDate;

    private Date completeDate;

    private Date creatdate;

    private Date editdate;

    private Date planStartTime;

    private Date planEndTime;

    private Date planProductTime;

    private String substationType;

    private String provinceCode;

    private String provinceName;

    private String isStop;

    private Date dataEditdate;


    public TSscBasicSinglePro() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode == null ? null : proCode.trim();
    }

    public String getSingleCode() {
        return singleCode;
    }

    public void setSingleCode(String singleCode) {
        this.singleCode = singleCode == null ? null : singleCode.trim();
    }

    public String getSingleName() {
        return singleName;
    }

    public void setSingleName(String singleName) {
        this.singleName = singleName == null ? null : singleName.trim();
    }

    public String getSingleType() {
        return singleType;
    }

    public void setSingleType(String singleType) {
        this.singleType = singleType == null ? null : singleType.trim();
    }

    public String getLineLength() {
        return lineLength;
    }

    public void setLineLength(String lineLength) {
        this.lineLength = lineLength == null ? null : lineLength.trim();
    }

    public String getSubsCapacity() {
        return subsCapacity;
    }

    public void setSubsCapacity(String subsCapacity) {
        this.subsCapacity = subsCapacity == null ? null : subsCapacity.trim();
    }

    public String getVoltageLevel() {
        return voltageLevel;
    }

    public void setVoltageLevel(String voltageLevel) {
        this.voltageLevel = voltageLevel == null ? null : voltageLevel.trim();
    }

    public String getPreType() {
        return preType;
    }

    public void setPreType(String preType) {
        this.preType = preType == null ? null : preType.trim();
    }

    public String getManageUnit() {
        return manageUnit;
    }

    public void setManageUnit(String manageUnit) {
        this.manageUnit = manageUnit == null ? null : manageUnit.trim();
    }

    public String getBuildScale() {
        return buildScale;
    }

    public void setBuildScale(String buildScale) {
        this.buildScale = buildScale == null ? null : buildScale.trim();
    }

    public String getManageUnitCode() {
        return manageUnitCode;
    }

    public void setManageUnitCode(String manageUnitCode) {
        this.manageUnitCode = manageUnitCode == null ? null : manageUnitCode.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    public Date getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }

    public Date getCreatdate() {
        return creatdate;
    }

    public void setCreatdate(Date creatdate) {
        this.creatdate = creatdate;
    }

    public Date getEditdate() {
        return editdate;
    }

    public void setEditdate(Date editdate) {
        this.editdate = editdate;
    }

    public Date getPlanStartTime() {
        return planStartTime;
    }

    public void setPlanStartTime(Date planStartTime) {
        this.planStartTime = planStartTime;
    }

    public Date getPlanEndTime() {
        return planEndTime;
    }

    public void setPlanEndTime(Date planEndTime) {
        this.planEndTime = planEndTime;
    }

    public Date getPlanProductTime() {
        return planProductTime;
    }

    public void setPlanProductTime(Date planProductTime) {
        this.planProductTime = planProductTime;
    }

    public String getSubstationType() {
        return substationType;
    }

    public void setSubstationType(String substationType) {
        this.substationType = substationType == null ? null : substationType.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public String getIsStop() {
        return isStop;
    }

    public void setIsStop(String isStop) {
        this.isStop = isStop == null ? null : isStop.trim();
    }

    public Date getDataEditdate() {
        return dataEditdate;
    }

    public void setDataEditdate(Date dataEditdate) {
        this.dataEditdate = dataEditdate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TSscBasicSinglePro that = (TSscBasicSinglePro) o;
        return Objects.equals(id, that.id) && Objects.equals(proCode, that.proCode) && Objects.equals(singleCode, that.singleCode) && Objects.equals(singleName, that.singleName) && Objects.equals(singleType, that.singleType) && Objects.equals(lineLength, that.lineLength) && Objects.equals(subsCapacity, that.subsCapacity) && Objects.equals(voltageLevel, that.voltageLevel) && Objects.equals(preType, that.preType) && Objects.equals(manageUnit, that.manageUnit) && Objects.equals(buildScale, that.buildScale) && Objects.equals(manageUnitCode, that.manageUnitCode) && Objects.equals(startDate, that.startDate) && Objects.equals(productDate, that.productDate) && Objects.equals(completeDate, that.completeDate) && Objects.equals(creatdate, that.creatdate) && Objects.equals(editdate, that.editdate) && Objects.equals(planStartTime, that.planStartTime) && Objects.equals(planEndTime, that.planEndTime) && Objects.equals(planProductTime, that.planProductTime) && Objects.equals(substationType, that.substationType) && Objects.equals(provinceCode, that.provinceCode) && Objects.equals(provinceName, that.provinceName) && Objects.equals(isStop, that.isStop) && Objects.equals(dataEditdate, that.dataEditdate);
    }

}