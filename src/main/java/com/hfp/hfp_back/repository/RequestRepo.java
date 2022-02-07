package com.hfp.hfp_back.repository;

import com.hfp.hfp_back.model.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

@Repository
@Table(name = "Request")
public interface RequestRepo extends CrudRepository<Request, Long> {
    void deleteRequestById(Long id);
}
