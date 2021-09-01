package com.example.autofine_maven_.dto;

import org.hibernate.annotations.Type;

import javax.persistence.Lob;
import java.math.BigDecimal;
import java.util.Date;

public class AddFineDTO {


    private Long carDataId;
    private Date dateOfViolation;
    private String typeOfViolation;
    private String decreeNumber;
    private BigDecimal amountOfTheFine;
    private Boolean payment;
    @Lob
    @Type(type="org.hibernate.type.BinaryType")
    private byte[] image;

    public AddFineDTO() {
    }

    public AddFineDTO(Long carDataId, Date dateOfViolation, String typeOfViolation, String decreeNumber, BigDecimal amountOfTheFine, Boolean payment, byte[] image) {
        this.carDataId = carDataId;
        this.dateOfViolation = dateOfViolation;
        this.typeOfViolation = typeOfViolation;
        this.decreeNumber = decreeNumber;
        this.amountOfTheFine = amountOfTheFine;
        this.payment = payment;
        this.image = image;
    }

    public Long getCarDataId() {
        return carDataId;
    }

    public void setCarDataId(Long carDataId) {
        this.carDataId = carDataId;
    }

    public Date getDateOfViolation() {
        return dateOfViolation;
    }

    public void setDateOfViolation(Date dateOfViolation) {
        this.dateOfViolation = dateOfViolation;
    }

    public String getTypeOfViolation() {
        return typeOfViolation;
    }

    public void setTypeOfViolation(String typeOfViolation) {
        this.typeOfViolation = typeOfViolation;
    }

    public String getDecreeNumber() {
        return decreeNumber;
    }

    public void setDecreeNumber(String decreeNumber) {
        this.decreeNumber = decreeNumber;
    }

    public BigDecimal getAmountOfTheFine() {
        return amountOfTheFine;
    }

    public void setAmountOfTheFine(BigDecimal amountOfTheFine) {
        this.amountOfTheFine = amountOfTheFine;
    }

    public Boolean getPayment() {
        return payment;
    }

    public void setPayment(Boolean payment) {
        this.payment = payment;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }



}
