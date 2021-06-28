package com.yy.mybatis.domain;

import java.util.Date;
import java.util.Objects;

/**
 * 每日站班会信息
 */
public class TSscBasicDailyStation {
    private String id;

    private String objTicket;

    private String ticketCode;

    private Date buildDate;

    private String workPosition;

    private String workContent;

    private String leadIdent;

    private String safeIdent;

    private String dateRiskLevel;

    private String remark;

    private String changes;

    private String controlMeasures;

    private String state;

    private String objRadio;

    private String buildNum;

    private String leadName;

    private String safeName;

    private String objPicture;

    private String objThreeCheck;

    private Date rebackTime;

    private String gps;

    private String bidCode;

    private String singleCode;

    private String proCode;

    private String isDelete;

    private String dataSource;

    private String creator;

    private Date createdate;

    private String editor;

    private Date editdate;

    private Date dataEditdate;

    public TSscBasicDailyStation(String id, String objTicket, String ticketCode, Date buildDate, String workPosition, String workContent, String leadIdent, String safeIdent, String dateRiskLevel, String remark, String changes, String controlMeasures, String state, String objRadio, String buildNum, String leadName, String safeName, String objPicture, String objThreeCheck, Date rebackTime, String gps, String bidCode, String singleCode, String proCode, String isDelete, String dataSource, String creator, Date createdate, String editor, Date editdate, Date dataEditdate) {
        this.id = id;
        this.objTicket = objTicket;
        this.ticketCode = ticketCode;
        this.buildDate = buildDate;
        this.workPosition = workPosition;
        this.workContent = workContent;
        this.leadIdent = leadIdent;
        this.safeIdent = safeIdent;
        this.dateRiskLevel = dateRiskLevel;
        this.remark = remark;
        this.changes = changes;
        this.controlMeasures = controlMeasures;
        this.state = state;
        this.objRadio = objRadio;
        this.buildNum = buildNum;
        this.leadName = leadName;
        this.safeName = safeName;
        this.objPicture = objPicture;
        this.objThreeCheck = objThreeCheck;
        this.rebackTime = rebackTime;
        this.gps = gps;
        this.bidCode = bidCode;
        this.singleCode = singleCode;
        this.proCode = proCode;
        this.isDelete = isDelete;
        this.dataSource = dataSource;
        this.creator = creator;
        this.createdate = createdate;
        this.editor = editor;
        this.editdate = editdate;
        this.dataEditdate = dataEditdate;
    }

    public TSscBasicDailyStation() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getObjTicket() {
        return objTicket;
    }

    public void setObjTicket(String objTicket) {
        this.objTicket = objTicket == null ? null : objTicket.trim();
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode == null ? null : ticketCode.trim();
    }

    public Date getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(Date buildDate) {
        this.buildDate = buildDate;
    }

    public String getWorkPosition() {
        return workPosition;
    }

    public void setWorkPosition(String workPosition) {
        this.workPosition = workPosition == null ? null : workPosition.trim();
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent == null ? null : workContent.trim();
    }

    public String getLeadIdent() {
        return leadIdent;
    }

    public void setLeadIdent(String leadIdent) {
        this.leadIdent = leadIdent == null ? null : leadIdent.trim();
    }

    public String getSafeIdent() {
        return safeIdent;
    }

    public void setSafeIdent(String safeIdent) {
        this.safeIdent = safeIdent == null ? null : safeIdent.trim();
    }

    public String getDateRiskLevel() {
        return dateRiskLevel;
    }

    public void setDateRiskLevel(String dateRiskLevel) {
        this.dateRiskLevel = dateRiskLevel == null ? null : dateRiskLevel.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getChanges() {
        return changes;
    }

    public void setChanges(String changes) {
        this.changes = changes == null ? null : changes.trim();
    }

    public String getControlMeasures() {
        return controlMeasures;
    }

    public void setControlMeasures(String controlMeasures) {
        this.controlMeasures = controlMeasures == null ? null : controlMeasures.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getObjRadio() {
        return objRadio;
    }

    public void setObjRadio(String objRadio) {
        this.objRadio = objRadio == null ? null : objRadio.trim();
    }

    public String getBuildNum() {
        return buildNum;
    }

    public void setBuildNum(String buildNum) {
        this.buildNum = buildNum == null ? null : buildNum.trim();
    }

    public String getLeadName() {
        return leadName;
    }

    public void setLeadName(String leadName) {
        this.leadName = leadName == null ? null : leadName.trim();
    }

    public String getSafeName() {
        return safeName;
    }

    public void setSafeName(String safeName) {
        this.safeName = safeName == null ? null : safeName.trim();
    }

    public String getObjPicture() {
        return objPicture;
    }

    public void setObjPicture(String objPicture) {
        this.objPicture = objPicture == null ? null : objPicture.trim();
    }

    public String getObjThreeCheck() {
        return objThreeCheck;
    }

    public void setObjThreeCheck(String objThreeCheck) {
        this.objThreeCheck = objThreeCheck == null ? null : objThreeCheck.trim();
    }

    public Date getRebackTime() {
        return rebackTime;
    }

    public void setRebackTime(Date rebackTime) {
        this.rebackTime = rebackTime;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps == null ? null : gps.trim();
    }

    public String getBidCode() {
        return bidCode;
    }

    public void setBidCode(String bidCode) {
        this.bidCode = bidCode == null ? null : bidCode.trim();
    }

    public String getSingleCode() {
        return singleCode;
    }

    public void setSingleCode(String singleCode) {
        this.singleCode = singleCode == null ? null : singleCode.trim();
    }

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode == null ? null : proCode.trim();
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource == null ? null : dataSource.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    public Date getEditdate() {
        return editdate;
    }

    public void setEditdate(Date editdate) {
        this.editdate = editdate;
    }

    public Date getDataEditdate() {
        return dataEditdate;
    }

    public void setDataEditdate(Date dataEditdate) {
        this.dataEditdate = dataEditdate;
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TSscBasicDailyStation that = (TSscBasicDailyStation) o;
        return Objects.equals(id, that.id) && Objects.equals(objTicket, that.objTicket) && Objects.equals(ticketCode, that.ticketCode) && Objects.equals(buildDate, that.buildDate) && Objects.equals(workPosition, that.workPosition) && Objects.equals(workContent, that.workContent) && Objects.equals(leadIdent, that.leadIdent) && Objects.equals(safeIdent, that.safeIdent) && Objects.equals(dateRiskLevel, that.dateRiskLevel) && Objects.equals(remark, that.remark) && Objects.equals(changes, that.changes) && Objects.equals(controlMeasures, that.controlMeasures) && Objects.equals(state, that.state) && Objects.equals(objRadio, that.objRadio) && Objects.equals(buildNum, that.buildNum) && Objects.equals(leadName, that.leadName) && Objects.equals(safeName, that.safeName) && Objects.equals(objPicture, that.objPicture) && Objects.equals(objThreeCheck, that.objThreeCheck) && Objects.equals(rebackTime, that.rebackTime) && Objects.equals(gps, that.gps) && Objects.equals(bidCode, that.bidCode) && Objects.equals(singleCode, that.singleCode) && Objects.equals(proCode, that.proCode) && Objects.equals(isDelete, that.isDelete) && Objects.equals(dataSource, that.dataSource) && Objects.equals(creator, that.creator) && Objects.equals(createdate, that.createdate) && Objects.equals(editor, that.editor) && Objects.equals(editdate, that.editdate) && Objects.equals(dataEditdate, that.dataEditdate);
    }

}