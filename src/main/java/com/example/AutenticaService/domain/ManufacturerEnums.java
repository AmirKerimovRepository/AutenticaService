package com.example.AutenticaService.domain;

public enum ManufacturerEnums {
    MSI("Msi"),
    COOLERMASTER("CoolerMaster"),
    INTEL("Intel"),
    ASUS("Asus"),
    HP("HP"),
    DELL("Dell"),
    LENOVO("Lenovo"),
    GIGABYTE("Gigabyte"),
    TOSHIBA("Toshiba"),
    CORSAIR("Corsair"),
    SONY("Sony");

    private String manufacturerName;

    ManufacturerEnums(String manufacturerName){
        this.manufacturerName = manufacturerName;
    }

}
