package com.Edfoal.user_service.service;

import com.Edfoal.user_service.Utilities.StatusUpdateDto;
import com.Edfoal.user_service.Utilities.Status_enum;
import com.Edfoal.user_service.Utilities.UserPostDto;
import com.Edfoal.user_service.entity.User;


public interface UserServiceInterface {
     UserPostDto saveUser(User user);
     User updateUser(User user,Long Id);
     User getUserWithId(long id);
     void statusUpdate(StatusUpdateDto statusUpdateDto, Long id);

     Status_enum getStatus(Long id);
}
