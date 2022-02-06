package com.hfp.hfp_back.repository;

import com.hfp.hfp_back.model.Organization;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Table;

@Repository
@Table(name = "Organization")
public interface  OrgRepo extends CrudRepository<Organization, Long> {
}
