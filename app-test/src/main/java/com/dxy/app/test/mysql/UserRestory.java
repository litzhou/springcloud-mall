package com.dxy.app.test.mysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author zhougaojun
 * @since 2018/09/25
 **/
@Repository
public interface UserRestory extends JpaRepository<User, Long> {
}

 