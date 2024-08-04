package com.businessmanagement.repositories;

import com.businessmanagement.entities.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepository extends CrudRepository<Admin, Integer>
{
    public Admin findByAdminEmail(String email);
}

