package com.example.autofine_maven_.dto;

public class UpdateCarDataDTO {
    private Long id;
    private String plateNumber;
    private String seriesNumberDocument;

    public UpdateCarDataDTO() {
    }

    public UpdateCarDataDTO(Long id, String plateNumber, String seriesNumberDocument) {
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
}
