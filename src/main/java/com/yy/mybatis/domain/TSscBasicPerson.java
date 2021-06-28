package com.yy.mybatis.domain;

import java.util.Date;
import java.util.Objects;

/**
 * 人员基本信息
 */
public class TSscBasicPerson {
    private String id;

    private String blood;

    private String contactName;

    private String contactPhone;

    private String encryIdent;

    private String perName;

    private String sex;

    private String sexCode;

    private String ident;

    private String eduCode;

    private String eduName;

    private String nation;

    private String cardNum;

    private String phone;

    private String provinceCode;

    private String contactRelation;

    private String workYear;

    private String workStartDate;

    private String objUnit;

    private String iscAcount;

    private String isEffective;

    private String creator;

    private Date creatdate;

    private Date editdate;

    private String employmentform;

    private String whethertoquit;

    private String isblacklist;

    private String technicaltitles;

    private String phyhosptial;

    private String phydate;

    private String phyrdesult;

    private String currentworkunitnumber;

    private Date dataEditdate;


    public TSscBasicPerson() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood == null ? null : blood.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    public String getEncryIdent() {
        return encryIdent;
    }

    public void setEncryIdent(String encryIdent) {
        this.encryIdent = encryIdent == null ? null : encryIdent.trim();
    }

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName == null ? null : perName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode == null ? null : sexCode.trim();
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident == null ? null : ident.trim();
    }

    public String getEduCode() {
        return eduCode;
    }

    public void setEduCode(String eduCode) {
        this.eduCode = eduCode == null ? null : eduCode.trim();
    }

    public String getEduName() {
        return eduName;
    }

    public void setEduName(String eduName) {
        this.eduName = eduName == null ? null : eduName.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum == null ? null : cardNum.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getContactRelation() {
        return contactRelation;
    }

    public void setContactRelation(String contactRelation) {
        this.contactRelation = contactRelation == null ? null : contactRelation.trim();
    }

    public String getWorkYear() {
        return workYear;
    }

    public void setWorkYear(String workYear) {
        this.workYear = workYear == null ? null : workYear.trim();
    }

    public String getWorkStartDate() {
        return workStartDate;
    }

    public void setWorkStartDate(String workStartDate) {
        this.workStartDate = workStartDate == null ? null : workStartDate.trim();
    }

    public String getObjUnit() {
        return objUnit;
    }

    public void setObjUnit(String objUnit) {
        this.objUnit = objUnit == null ? null : objUnit.trim();
    }

    public String getIscAcount() {
        return iscAcount;
    }

    public void setIscAcount(String iscAcount) {
        this.iscAcount = iscAcount == null ? null : iscAcount.trim();
    }

    public String getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(String isEffective) {
        this.isEffective = isEffective == null ? null : isEffective.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
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

    public String getEmploymentform() {
        return employmentform;
    }

    public void setEmploymentform(String employmentform) {
        this.employmentform = employmentform == null ? null : employmentform.trim();
    }

    public String getWhethertoquit() {
        return whethertoquit;
    }

    public void setWhethertoquit(String whethertoquit) {
        this.whethertoquit = whethertoquit == null ? null : whethertoquit.trim();
    }

    public String getIsblacklist() {
        return isblacklist;
    }

    public void setIsblacklist(String isblacklist) {
        this.isblacklist = isblacklist == null ? null : isblacklist.trim();
    }

    public String getTechnicaltitles() {
        return technicaltitles;
    }

    public void setTechnicaltitles(String technicaltitles) {
        this.technicaltitles = technicaltitles == null ? null : technicaltitles.trim();
    }

    public String getPhyhosptial() {
        return phyhosptial;
    }

    public void setPhyhosptial(String phyhosptial) {
        this.phyhosptial = phyhosptial == null ? null : phyhosptial.trim();
    }

    public String getPhydate() {
        return phydate;
    }

    public void setPhydate(String phydate) {
        this.phydate = phydate == null ? null : phydate.trim();
    }

    public String getPhyrdesult() {
        return phyrdesult;
    }

    public void setPhyrdesult(String phyrdesult) {
        this.phyrdesult = phyrdesult == null ? null : phyrdesult.trim();
    }

    public String getCurrentworkunitnumber() {
        return currentworkunitnumber;
    }

    public void setCurrentworkunitnumber(String currentworkunitnumber) {
        this.currentworkunitnumber = currentworkunitnumber == null ? null : currentworkunitnumber.trim();
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
        TSscBasicPerson that = (TSscBasicPerson) o;
        return Objects.equals(id, that.id) && Objects.equals(blood, that.blood) && Objects.equals(contactName, that.contactName) && Objects.equals(contactPhone, that.contactPhone) && Objects.equals(encryIdent, that.encryIdent) && Objects.equals(perName, that.perName) && Objects.equals(sex, that.sex) && Objects.equals(sexCode, that.sexCode) && Objects.equals(ident, that.ident) && Objects.equals(eduCode, that.eduCode) && Objects.equals(eduName, that.eduName) && Objects.equals(nation, that.nation) && Objects.equals(cardNum, that.cardNum) && Objects.equals(phone, that.phone) && Objects.equals(provinceCode, that.provinceCode) && Objects.equals(contactRelation, that.contactRelation) && Objects.equals(workYear, that.workYear) && Objects.equals(workStartDate, that.workStartDate) && Objects.equals(objUnit, that.objUnit) && Objects.equals(iscAcount, that.iscAcount) && Objects.equals(isEffective, that.isEffective) && Objects.equals(creator, that.creator) && Objects.equals(creatdate, that.creatdate) && Objects.equals(editdate, that.editdate) && Objects.equals(employmentform, that.employmentform) && Objects.equals(whethertoquit, that.whethertoquit) && Objects.equals(isblacklist, that.isblacklist) && Objects.equals(technicaltitles, that.technicaltitles) && Objects.equals(phyhosptial, that.phyhosptial) && Objects.equals(phydate, that.phydate) && Objects.equals(phyrdesult, that.phyrdesult) && Objects.equals(currentworkunitnumber, that.currentworkunitnumber) && Objects.equals(dataEditdate, that.dataEditdate);
    }


}