package com.example.autofine_maven_.dto;

public class AddCarDataDTO {
    private String plateNumber;

    private String seriesNumberDocument;

    public AddCarDataDTO() {
    }

    public AddCarDataDTO(String plateNumber, String seriesNumberDocument) {
        this.plateNumber = plateNumber;
        this.seriesNumberDocument = seriesNumberDocument;
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


}
