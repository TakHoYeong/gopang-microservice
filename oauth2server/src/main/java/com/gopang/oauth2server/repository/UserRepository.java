package com.gopang.oauth2server.repository;

import com.gopang.oauth2server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * 사용자를 email(username)으로 찾는다
     * @param username
     * @return Optional&lt;User&gt;
     */
    Optional<User> findByUsername(String username);

}
