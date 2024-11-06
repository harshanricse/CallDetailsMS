package com.harsha.infytel_calldetails.service;

import com.harsha.infytel_calldetails.dto.CallDetailsDTO;
import com.harsha.infytel_calldetails.entity.CallDetails;
import com.harsha.infytel_calldetails.repository.CallDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class CallDetailsService {
    @Autowired
    private CallDetailsRepository callDetailsRepository;
    public List<CallDetailsDTO> getCustomerDetails(long phoneNo){
        System.out.println("Call details request for customer "+phoneNo);
        List<CallDetails> callDetails = callDetailsRepository.findByCalledBy(phoneNo);
        List<CallDetailsDTO> callDetailsDTOS = new ArrayList<>();
        for(CallDetails call: callDetails){
            callDetailsDTOS.add(CallDetailsDTO.valueOf(call));
        }
        System.out.println("CallDetails for customer"+ callDetails);
        return callDetailsDTOS;
    }
}
