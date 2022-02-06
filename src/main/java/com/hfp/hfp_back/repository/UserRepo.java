package com.hfp.hfp_back.repository;

import com.hfp.hfp_back.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

@Repository
@Table(name = "UserRus")
public interface UserRepo extends CrudRepository<User, Long> {
}
