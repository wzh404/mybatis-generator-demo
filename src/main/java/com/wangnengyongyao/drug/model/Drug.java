package com.wangnengyongyao.drug.model;

import java.io.Serializable;
import java.util.Date;

public class Drug implements Serializable {
    private Integer id;

    private String approvalNumber;

    private String name;

    private String ename;

    private String dosageForm;

    private String specifications;

    private String manufacturer;

    private String manufacturerAddress;

    private String classify;

    private String issuingDate;

    private String usage;

    private String functions;

    private String otc;

    private String validityDay;

    private Date createTime;

    private String book;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber == null ? null : approvalNumber.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getDosageForm() {
        return dosageForm;
    }

    public void setDosageForm(String dosageForm) {
        this.dosageForm = dosageForm == null ? null : dosageForm.trim();
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public String getManufacturerAddress() {
        return manufacturerAddress;
    }

    public void setManufacturerAddress(String manufacturerAddress) {
        this.manufacturerAddress = manufacturerAddress == null ? null : manufacturerAddress.trim();
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify == null ? null : classify.trim();
    }

    public String getIssuingDate() {
        return issuingDate;
    }

    public void setIssuingDate(String issuingDate) {
        this.issuingDate = issuingDate == null ? null : issuingDate.trim();
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage == null ? null : usage.trim();
    }

    public String getFunctions() {
        return functions;
    }

    public void setFunctions(String functions) {
        this.functions = functions == null ? null : functions.trim();
    }

    public String getOtc() {
        return otc;
    }

    public void setOtc(String otc) {
        this.otc = otc == null ? null : otc.trim();
    }

    public String getValidityDay() {
        return validityDay;
    }

    public void setValidityDay(String validityDay) {
        this.validityDay = validityDay == null ? null : validityDay.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book == null ? null : book.trim();
    }
}