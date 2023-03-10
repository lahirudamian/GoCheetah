package com.carbooking.model;

import org.hibernate.validator.constraints.UniqueElements;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;

public class DriverDto {
    @UniqueElements
    @NotEmpty(message = "driver id must not be empty")
    private String driverId;

    @NotEmpty(message = "first name must not be empty")
    private String name;

    @NotEmpty(message = "contact number must not be empty")
    @UniqueElements
    private String contactNo;

    @Email(message = "email should be a valid email")
    private String emailAddress;

    private List<LocationDto> outletLocationDto;

    public List<LocationDto> getOutletLocationDto() {
        return outletLocationDto;
    }

    public void setOutletLocationDto(List<LocationDto> outletLocationDto) {
        this.outletLocationDto = outletLocationDto;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
