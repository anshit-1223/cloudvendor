package com.orginazation.cloudvendor.service.implementation;

import com.orginazation.cloudvendor.model.CloudVendorModel;
import com.orginazation.cloudvendor.repository.CloudVendorRepository;
import com.orginazation.cloudvendor.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImplementation implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImplementation(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }


    @Override
    public String createCloudVendor(CloudVendorModel cloudVendorModel) {
        cloudVendorRepository.save(cloudVendorModel);
        return "Created";
    }

    @Override
    public CloudVendorModel getCloudVendor(String cloudVendorId) {
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public String updateCloudVendor(CloudVendorModel cloudVendorModel) {
        cloudVendorRepository.save(cloudVendorModel);
        return "Updated";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Deleted";
    }

    @Override
    public List<CloudVendorModel> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}
