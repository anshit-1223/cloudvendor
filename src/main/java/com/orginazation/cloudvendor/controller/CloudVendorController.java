package com.orginazation.cloudvendor.controller;

import com.orginazation.cloudvendor.model.CloudVendorModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
    CloudVendorModel cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendorModel getCloudVendorDetails(String vendorId){
//        return  new CloudVendorModel("1","Linode","USA","9112365456");
        return cloudVendor;
    }

    @PostMapping
    public String createCloudVendorModel(@RequestBody CloudVendorModel cloudVendor){
        this.cloudVendor=cloudVendor;
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String updateCloudVendorModel(@RequestBody CloudVendorModel cloudVendor){
        this.cloudVendor=cloudVendor;
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorModel(String vendorId){
        this.cloudVendor=null;
        return "Cloud Vendor Deleted Successfully";
    }
}
