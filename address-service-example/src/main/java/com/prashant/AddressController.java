package com.prashant;

import com.prashant.dao.AddressDao;
import com.prashant.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressDao dao;

    @GetMapping
    public List<Address> getAddress(){
        return dao.getAddress();
    }

    @GetMapping("/{id}")
    public Address getAddressById(@PathVariable int id){
        return dao.getById(id);
    }
}
