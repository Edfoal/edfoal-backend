package com.Edfoal.user_service.controller;

import com.Edfoal.user_service.Utilities.StatusUpdateDto;
import com.Edfoal.user_service.Utilities.Status_enum;
import com.Edfoal.user_service.Utilities.UserPostDto;
import com.Edfoal.user_service.entity.User;
import com.Edfoal.user_service.service.UserServiceInterfaceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserServiceInterfaceImpl userService;

    @PostMapping("/user")
    public ResponseEntity<UserPostDto> saveUser(@RequestBody User user) {
        log.info("Inside saveUser of UserController");
        UserPostDto created_user = userService.saveUser(user);
        return ResponseEntity.ok(created_user);
    }

    @PostMapping("/user/update/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user,@PathVariable("id") Long id){
        User  updated_user = userService.updateUser(user,id);
        return ResponseEntity.ok(updated_user);
    }


    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserWithId(@PathVariable("id") Long userId) {
        log.info("Inside getUserWithID of UserController");
        User user =userService.getUserWithId(userId);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/user/status/{id}")
    public ResponseEntity<StatusUpdateDto> statusUpdate(@RequestBody StatusUpdateDto statusUpdateDto, @PathVariable Long id){
        log.info("Inside userStatus Update of User Controller");
        userService.statusUpdate(statusUpdateDto,id);
        return ResponseEntity.ok(null);
    }

    @GetMapping("/user/status/{id}")
    public ResponseEntity<Status_enum> getStatus(@PathVariable Long id){
        return ResponseEntity.ok(userService.getStatus(id));
    }

}
