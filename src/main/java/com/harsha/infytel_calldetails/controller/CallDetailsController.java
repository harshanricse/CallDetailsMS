package com.harsha.infytel_calldetails.controller;

import com.harsha.infytel_calldetails.dto.CallDetailsDTO;
import com.harsha.infytel_calldetails.service.CallDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class CallDetailsController {
    @Autowired
    CallDetailsService callDetailsService;
    @GetMapping(value = "/customers/{phoneNo}/calldetails")
    public List<CallDetailsDTO> getCustomerCallDetails(@PathVariable long phoneNo){
        System.out.println("Call details request for customer"+phoneNo);
        return callDetailsService.getCustomerDetails(phoneNo);
    }
}
