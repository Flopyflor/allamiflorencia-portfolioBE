/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.allamiflorencia.Portfolio.users;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author flopy
 */
public interface UserRepository extends JpaRepository<User, Integer> {

  @Query(value="select * from user where user.username = ?1", nativeQuery=true)
  Optional<User> findByUsername(String email);

}

