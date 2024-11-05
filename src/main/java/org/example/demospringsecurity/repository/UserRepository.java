package org.example.demospringsecurity.repository;

import org.example.demospringsecurity.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

    Users findByUserName(String userName);
}
