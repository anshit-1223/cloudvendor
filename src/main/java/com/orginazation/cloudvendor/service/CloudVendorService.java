package com.orginazation.cloudvendor.service;

import com.orginazation.cloudvendor.model.CloudVendorModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CloudVendorService {

    public String createCloudVendor(CloudVendorModel cloudVendorModel);
    public CloudVendorModel getCloudVendor(String cloudVendorId);
    public String updateCloudVendor(CloudVendorModel cloudVendorModel);
    public String deleteCloudVendor(String cloudVendorId);
    public List<CloudVendorModel> getAllCloudVendors();
}
