package com.fiqri.userservice.service;

import com.fiqri.userservice.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User, String> {
}
