package com.example.AutenticaService.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "requests")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "manufacturer")
    private ManufacturerEnums manufacturer;

    @Column(name = "category")
    private CategoryEnums category;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "description")
    private String description;

    @Column(name = "add_time")
    private LocalDateTime dateTime;

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ManufacturerEnums getManufacturer() {
        return manufacturer;
    }

    public void setManufacturerEnums(ManufacturerEnums manufacturer) {
        this.manufacturer = manufacturer;
    }

    public CategoryEnums getCategoryEnums() {
        return category;
    }

    public void setCategoryEnums(CategoryEnums categoryEnums) {
        this.category = categoryEnums;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", manufacturerEnums=" + manufacturer +
                ", categoryEnums=" + category +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                '}';
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, manufacturer, category, quantity, description);
    }

}
