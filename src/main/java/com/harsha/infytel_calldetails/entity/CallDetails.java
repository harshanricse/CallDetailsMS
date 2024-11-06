package com.harsha.infytel_calldetails.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jdk.jfr.Enabled;
import lombok.Data;

import java.util.Date;
@Data
@Entity(name="calldetails")
public class CallDetails {
    @Id
    @GeneratedValue
    private long id;
    private long calledBy;
    private long calledTo;
    private Date calledOn;
    private int duration;
}
