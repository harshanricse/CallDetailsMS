package com.harsha.infytel_calldetails.dto;

import com.harsha.infytel_calldetails.entity.CallDetails;
import lombok.Data;

import java.util.Date;

@Data
public class CallDetailsDTO {
    private long calledBy;
    private long calledTo;
    Date calledOn;
    int duration;

    //converts entity to dto
    public static CallDetailsDTO valueOf(CallDetails callDetails){
        CallDetailsDTO callDetailsDTO = new CallDetailsDTO();
        callDetailsDTO.setCalledBy(callDetails.getCalledBy());
        callDetailsDTO.setCalledOn(callDetails.getCalledOn());
        callDetailsDTO.setDuration(callDetails.getDuration());
        return callDetailsDTO;
    }

}
