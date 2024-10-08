package com.orginazation.cloudvendor.controller;

import com.orginazation.cloudvendor.model.CloudVendorModel;
import com.orginazation.cloudvendor.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }


//Read specific cloud vendor from db
    @GetMapping("{vendorId}")
    public CloudVendorModel getCloudVendorDetails(@PathVariable("vendorId") String vendorId){
//        return  new CloudVendorModel("1","Linode","USA","9112365456");
        return cloudVendorService.getCloudVendor(vendorId);
    }

//    read all cloud vendor from db
    @GetMapping()
    public List<CloudVendorModel> getAllCloudVendorDetails(){
        return cloudVendorService.getAllCloudVendors();
    }

    @PostMapping
    public String createCloudVendorModel(@RequestBody CloudVendorModel cloudVendor){
        return cloudVendorService.createCloudVendor(cloudVendor);
//        return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String updateCloudVendorModel(@RequestBody CloudVendorModel cloudVendor){
        return cloudVendorService.updateCloudVendor(cloudVendor);
//        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorModel(@PathVariable String vendorId){
        return cloudVendorService.deleteCloudVendor(vendorId);
//        return "Cloud Vendor Deleted Successfully";
    }
}
