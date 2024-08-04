package com.businessmanagement.repositories;

import com.businessmanagement.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer>
{
    public User findUserByUemail(String email);
}
