package com.demo.ssocenter.repository;

import com.demo.ssocenter.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created by jinzj on 2017/1/20.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long>,JpaSpecificationExecutor<User> {
}
