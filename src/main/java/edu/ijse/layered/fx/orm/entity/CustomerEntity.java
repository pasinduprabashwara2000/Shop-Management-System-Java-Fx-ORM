package edu.ijse.layered.fx.orm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerEntity {

    private int id;
    private String name;
    private String address;
    private int telNumber;

}
