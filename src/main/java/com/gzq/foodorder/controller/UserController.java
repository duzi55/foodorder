package com.gzq.foodorder.controller;

import com.gzq.foodorder.Repository.UserRepository;
import com.gzq.foodorder.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    @Resource
    UserRepository userRepository;
    @RequestMapping("login")
    public Map login(User u){
      Map m=new HashMap();
      User user=userRepository.findByUsernameAndPassword(u.getUsername(),u.getPassword());
      if(user==null){
          m.put("ruslt","Y");
      }else {
          m.put("ruslt","N");
      }
        return m;
    }
}
