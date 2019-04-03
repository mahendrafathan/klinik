package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.model.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {

}
