package com.orginazation.cloudvendor.repository;

import com.orginazation.cloudvendor.model.CloudVendorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendorModel, String> {
}
