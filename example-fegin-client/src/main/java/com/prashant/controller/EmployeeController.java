package com.prashant.controller;

import com.prashant.feignClientUtil.AddressFeignClient;
import com.prashant.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private AddressFeignClient addressFeignClient;

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        var address = addressFeignClient.getAddressById(employee.getEid());
        employee.setAddress(address);
        return employee;
    }
}
