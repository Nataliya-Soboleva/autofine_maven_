package com.example.autofine_maven_.models;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "cars_data")
public class CarData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String plateNumber;

    private String seriesNumberDocument;

    public CarData() {
    }

    public CarData(Long id, String plateNumber, String seriesNumberDocument) {
        this.id = id;
        this.plateNumber = plateNumber;
        this.seriesNumberDocument = seriesNumberDocument;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getSeriesNumberDocument() {
        return seriesNumberDocument;
    }

    public void setSeriesNumberDocument(String seriesNumberDocument) {
        this.seriesNumberDocument = seriesNumberDocument;
    }

    @Override
    public String toString() {
        return "CarData{" +
                "id=" + id +
                ", plateNumber='" + plateNumber + '\'' +
                ", seriesNumberDocument='" + seriesNumberDocument + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarData carData = (CarData) o;
        return id.equals(carData.id) && plateNumber.equals(carData.plateNumber) && seriesNumberDocument.equals(carData.seriesNumberDocument);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, plateNumber, seriesNumberDocument);
    }

}
