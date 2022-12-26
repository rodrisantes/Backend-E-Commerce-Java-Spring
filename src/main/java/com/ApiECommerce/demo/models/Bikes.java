package com.ApiECommerce.demo.models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Bikes")
@Data
@Getter
@Setter
public class Bikes {

    @Id
    private ObjectId id;
    private String name;
    private String maker;
    private Integer year;
    private String image;
    private String category;
    private Boolean isEBike;
    private String gender;
    private String priceCurrency;
    private Integer priceAmount;
    private Boolean softDelete;

}
