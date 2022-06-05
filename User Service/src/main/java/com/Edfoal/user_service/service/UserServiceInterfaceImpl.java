package com.Edfoal.user_service.service;
import com.Edfoal.user_service.Utilities.StatusUpdateDto;
import com.Edfoal.user_service.Utilities.Status_enum;
import com.Edfoal.user_service.Utilities.UserPostDto;
import com.Edfoal.user_service.entity.User;
import com.Edfoal.user_service.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceInterfaceImpl implements UserServiceInterface {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserPostDto saveUser(User user) {
        log.info("Inside saveUser of UserService");
        UserPostDto created_user = new UserPostDto();
        User saved_user = userRepository.save(user);
        created_user.setUserID(saved_user.getUserId());
        created_user.setUserName(saved_user.getUserName());
        created_user.setUserEmail(saved_user.getUserEmail());
        return created_user;
    }


    @Override
    public User updateUser(User user,Long id) {
        log.info("Inside update method");
        User existing_user = getUserWithId(id);
        if(user.getUserName() != null){
            existing_user.setUserName(user.getUserName());
        }
        if(user.getUserDisplayName() != null){
            existing_user.setUserDisplayName(user.getUserDisplayName());
        }
        if(user.getUserEmail() != null){
            existing_user.setUserEmail(user.getUserEmail());
        }
        if(user.getUserDOB() != null){
            existing_user.setUserDOB(user.getUserDOB());
        }
        if(user.getUserPhone() != null){
            existing_user.setUserPhone(user.getUserPhone());
        }
        if(user.getUserEnrolledUni() != null){
            existing_user.setUserEnrolledUni(user.getUserEnrolledUni());
        }
        if(user.getUserEnrolledCollege() != null){
            existing_user.setUserEnrolledCollege(user.getUserEnrolledCollege());
        }
        if(user.getUserEnrollmentBranch() != null){
            existing_user.setUserEnrollmentBranch(user.getUserEnrollmentBranch());
        }
        if(user.getUserEnrollmentNumber() != null){
            existing_user.setUserEnrollmentNumber(user.getUserEnrollmentNumber());
        }
        if(user.getUserEnrollmentStartYear() != null){
            existing_user.setUserEnrollmentStartYear(user.getUserEnrollmentStartYear());
        }
        if(user.getUserEnrollmentEndYear() != null){
            existing_user.setUserEnrollmentEndYear(user.getUserEnrollmentEndYear());
        }
        existing_user.setUserUpdatedAt();
        return userRepository.save(existing_user);
    }

    @Override
    public User getUserWithId(long Id) {
       return userRepository.findByUserId(Id);
    }

    @Override
    public void statusUpdate(StatusUpdateDto statusUpdateDto, Long id) {
        User user = getUserWithId(id);
        user.setUserStatus(statusUpdateDto.getStatus_enum());
        user.setUserUpdatedAt();
        userRepository.save(user);
    }

    @Override
    public Status_enum getStatus(Long id) {
        return getUserWithId(id).gettingUserStatus();
    }


}
