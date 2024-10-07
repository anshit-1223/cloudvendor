package com.orginazation.cloudvendor.controller;

import com.orginazation.cloudvendor.model.CloudVendorModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    @GetMapping("{vendorId}")
    public CloudVendorModel getCloudVendorDetails(String vendorId){
        return  new CloudVendorModel("1","Linode","USA","9112365456");
    }
}
