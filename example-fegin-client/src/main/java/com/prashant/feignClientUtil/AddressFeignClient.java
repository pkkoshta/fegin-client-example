package com.prashant.feignClientUtil;

import com.prashant.dto.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "address-service", url = "http://localhost:8080", path = "/address")
public interface AddressFeignClient {

    @GetMapping("/{id}")
    public Address getAddressById(@PathVariable int id);
}
