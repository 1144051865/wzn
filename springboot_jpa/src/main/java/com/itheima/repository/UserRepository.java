package com.itheima.repository;

import com.itheima.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author wangzhineng
 * @date 2019-10-31 - 20:33
 */
public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findAll();

    User findByIdAndName(Long id,String name);
}
