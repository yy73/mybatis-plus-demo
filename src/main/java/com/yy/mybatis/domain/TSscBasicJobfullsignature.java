package com.yy.mybatis.domain;

import java.util.Date;
import java.util.Objects;

/**
 * 作业票 全员 签名
 */
public class TSscBasicJobfullsignature {
    private String id;

    private String jobdailyId;

    private String userId;

    private String userName;

    private String remark;

    private String status;

    private String isIncoming;

    private String isPicture;

    private String creator;

    private String updator;

    private String audioId;

    private String pictureId;

    private String bidId;

    private String engerId;

    private String projectId;

    private String identityNo;

    private String departmentType;

    private String cardNo;

    private String personTypeCode;

    private String isDelete;

    private Date createTime;

    private Date updateTime;


    public TSscBasicJobfullsignature() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getJobdailyId() {
        return jobdailyId;
    }

    public void setJobdailyId(String jobdailyId) {
        this.jobdailyId = jobdailyId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getIsIncoming() {
        return isIncoming;
    }

    public void setIsIncoming(String isIncoming) {
        this.isIncoming = isIncoming == null ? null : isIncoming.trim();
    }

    public String getIsPicture() {
        return isPicture;
    }

    public void setIsPicture(String isPicture) {
        this.isPicture = isPicture == null ? null : isPicture.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    public String getAudioId() {
        return audioId;
    }

    public void setAudioId(String audioId) {
        this.audioId = audioId == null ? null : audioId.trim();
    }

    public String getPictureId() {
        return pictureId;
    }

    public void setPictureId(String pictureId) {
        this.pictureId = pictureId == null ? null : pictureId.trim();
    }

    public String getBidId() {
        return bidId;
    }

    public void setBidId(String bidId) {
        this.bidId = bidId == null ? null : bidId.trim();
    }

    public String getEngerId() {
        return engerId;
    }

    public void setEngerId(String engerId) {
        this.engerId = engerId == null ? null : engerId.trim();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo == null ? null : identityNo.trim();
    }

    public String getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(String departmentType) {
        this.departmentType = departmentType == null ? null : departmentType.trim();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public String getPersonTypeCode() {
        return personTypeCode;
    }

    public void setPersonTypeCode(String personTypeCode) {
        this.personTypeCode = personTypeCode == null ? null : personTypeCode.trim();
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TSscBasicJobfullsignature that = (TSscBasicJobfullsignature) o;
        return Objects.equals(id, that.id) && Objects.equals(jobdailyId, that.jobdailyId) && Objects.equals(userId, that.userId) && Objects.equals(userName, that.userName) && Objects.equals(remark, that.remark) && Objects.equals(status, that.status) && Objects.equals(isIncoming, that.isIncoming) && Objects.equals(isPicture, that.isPicture) && Objects.equals(creator, that.creator) && Objects.equals(updator, that.updator) && Objects.equals(audioId, that.audioId) && Objects.equals(pictureId, that.pictureId) && Objects.equals(bidId, that.bidId) && Objects.equals(engerId, that.engerId) && Objects.equals(projectId, that.projectId) && Objects.equals(identityNo, that.identityNo) && Objects.equals(departmentType, that.departmentType) && Objects.equals(cardNo, that.cardNo) && Objects.equals(personTypeCode, that.personTypeCode) && Objects.equals(isDelete, that.isDelete) && Objects.equals(createTime, that.createTime) && Objects.equals(updateTime, that.updateTime);
    }

}