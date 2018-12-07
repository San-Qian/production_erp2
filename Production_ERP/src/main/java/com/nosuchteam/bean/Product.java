package com.nosuchteam.bean;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;

public class Product {
    @Pattern(regexp = "[0-9a-zA-Z]+", message = "请输入数字或英文字母的组合")
    @Length(min = 3,max = 8,message = "请输入3-8位合法编号")
    private String productId;

    private String productName;

    private String productType;

    private String image;

    private String note;

    private Integer status;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}