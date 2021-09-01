package com.example.autofine_maven_.models;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "fines")
public class Fine implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="car_data_id", referencedColumnName = "id")
    private CarData carDataId;

    private Date dateOfViolation;
    private String typeOfViolation;
    private String decreeNumber;
    private BigDecimal amountOfTheFine;
    private Boolean payment;
    @Lob
    @Type(type="org.hibernate.type.BinaryType")
    private byte[] image;

    public Fine() {
    }

    public Fine(Long id, CarData carDataId, Date dateOfViolation, String typeOfViolation, String decreeNumber, BigDecimal amountOfTheFine, Boolean payment, byte[] image) {
        this.id = id;
        this.carDataId = carDataId;
        this.dateOfViolation = dateOfViolation;
        this.typeOfViolation = typeOfViolation;
        this.decreeNumber = decreeNumber;
        this.amountOfTheFine = amountOfTheFine;
        this.payment = payment;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CarData getCarDataId() {
        return carDataId;
    }

    public void setCarDataId(CarData carDataId) {
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

    @Override
    public String toString() {
        return "Fine{" +
                "id=" + id +
                ", carDataId=" + carDataId +
                ", dateOfViolation=" + dateOfViolation +
                ", typeOfViolation='" + typeOfViolation + '\'' +
                ", decreeNumber='" + decreeNumber + '\'' +
                ", amountOfTheFine='" + amountOfTheFine + '\'' +
                ", payment=" + payment +
                ", image=" + Arrays.toString(image) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fine fine = (Fine) o;
        return id.equals(fine.id) && carDataId.equals(fine.carDataId) && dateOfViolation.equals(fine.dateOfViolation) && typeOfViolation.equals(fine.typeOfViolation) && decreeNumber.equals(fine.decreeNumber) && amountOfTheFine.equals(fine.amountOfTheFine) && payment.equals(fine.payment) && Arrays.equals(image, fine.image);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, carDataId, dateOfViolation, typeOfViolation, decreeNumber, amountOfTheFine, payment);
        result = 31 * result + Arrays.hashCode(image);
        return result;
    }



}
