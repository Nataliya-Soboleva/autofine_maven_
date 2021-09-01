package com.example.autofine_maven_.dto;

import java.math.BigDecimal;

public class UpdateFineDTO {

    private Long id;
    private BigDecimal amountOfTheFine;
    private Boolean payment;

    public UpdateFineDTO() {
    }

    public UpdateFineDTO(Long id, BigDecimal amountOfTheFine, Boolean payment) {
        this.id = id;
        this.amountOfTheFine = amountOfTheFine;
        this.payment = payment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
