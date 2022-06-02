package com.school.boardgame.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "select * from user where email = :email and pw = :pw", nativeQuery = true)
    User login(String email, String pw);

}
