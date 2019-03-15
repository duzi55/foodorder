package com.gzq.foodorder.Repository;

import com.gzq.foodorder.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
    User findByUsernameAndPassword(String u,String p);
}
