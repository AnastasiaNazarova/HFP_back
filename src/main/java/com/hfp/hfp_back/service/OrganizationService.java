package com.hfp.hfp_back.service;

import com.hfp.hfp_back.model.Organization;
import com.hfp.hfp_back.repository.OrgRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationService {
    private final OrgRepo orgRepo;

    @Autowired
    public  OrganizationService(OrgRepo orgRepo) {
        this.orgRepo = orgRepo;
    }

    public List<Organization> getAllOrganization() {
        return (List<Organization>) orgRepo.findAll();
    }

    public void addOrganization(Organization organization) {
        orgRepo.save(organization);
    }

    public void deleteOrganization(Long id) {
        orgRepo.deleteOrganizationById(id);
    }
}
