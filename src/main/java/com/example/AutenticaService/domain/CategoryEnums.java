package com.example.AutenticaService.domain;

public enum CategoryEnums {
    MOTHERBOARD ("Motherboard"),
    SSD_DISK("SSD Disk"),
    VIDEO_CARD("Video Card"),
    RAM("RAM"),
    HARD_DRIVE("hard drive"),
    PROCESSOR ("Processor"),
    POWER_SUPPLY("Power Supply"),
    PC_CORPUS("Pc Corpus"),
    PC("PC"),
    LAPTOP("Laptop"),
    SCANNER("Scanner"),
    FAX("Fax"),
    KEYBOARD("Keyboard"),
    SPEAKERS("Speakers"),
    MOUSE("Mouse"),
    PHONE("Phone");

    private final String equipmentName;

    CategoryEnums(String equipmentName){
        this.equipmentName = equipmentName;
    }
}
