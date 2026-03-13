package edu.ijse.layered.fx.orm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDTO {

    private int id;
    private String name;
    private int qyt;
    private Double price;

}
