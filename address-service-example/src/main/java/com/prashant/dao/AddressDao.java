package com.prashant.dao;

import com.prashant.model.Address;
import org.springframework.stereotype.Repository;

import javax.swing.event.ListDataEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class AddressDao {

    private static List<Address> addresses = Arrays.asList(
            new Address(1, "M.P.", "Jabalpur",482003L),
            new Address(2, "U.P.", "Lakhnaouw",48233L),
            new Address(3, "A.P.", "Vizak",482003L),
            new Address(4, "D.L.", "Karol bag",482003L));


    public Address getById(int id){
            Optional<Address> address = addresses.stream().filter(ad -> ad.getId() == id).findFirst();
       return address.get();
    }
    public List<Address> getAddress(){
        var address = Arrays.asList(
                new Address(1, "M.P.", "Jabalpur",482003L),
                new Address(2, "U.P.", "Lakhnaouw",48233L),
                new Address(3, "A.P.", "Vizak",482003L),
                new Address(4, "D.L.", "Karol bag",482003L));
        return address;
    }
}
