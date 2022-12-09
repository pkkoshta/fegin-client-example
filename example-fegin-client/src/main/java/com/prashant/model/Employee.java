package com.prashant.model;

import com.prashant.dto.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private int eid;
    private String name;
    private String lastname;
    private Address address;
}
