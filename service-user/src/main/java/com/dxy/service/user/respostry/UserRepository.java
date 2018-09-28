package com.dxy.service.user.respostry;

import com.dxy.service.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhougaojun
 * @since 2018/09/27
 **/
public interface UserRepository extends JpaRepository<User, Long> {
}

 