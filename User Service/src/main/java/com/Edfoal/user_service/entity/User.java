package com.Edfoal.user_service.entity;
import com.Edfoal.user_service.Utilities.Status_enum;
import org.hibernate.annotations.*;
import java.time.Instant;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name = "users")
@DynamicUpdate()
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "id_seqGenerator",sequenceName = "id_seq",initialValue = 100000,allocationSize = 5)
    private Long userId;

    private String userName;
    private String userDisplayName;
    private String userDOB;
    private String userEmail;
    private String userPhone;
    private String userEnrolledUni;
    private String userEnrolledCollege;
    private String userEnrollmentBranch;
    private String userEnrollmentNumber;
    private Integer userEnrollmentStartYear;
    private Integer userEnrollmentEndYear;

    private Status_enum userStatus = Status_enum.NOT_VERIFIED;

    @Column(name = "userCreatedAt", updatable = false)
    private  final String userCreatedAt = String.valueOf(Instant.now().getEpochSecond());

    private String userUpdatedAt = null;

    public User() {
    }

    public User(Long userId, String userName, String userDisplayName, String userDOB, String userEmail, String userPhone, String userEnrolledUni, String userEnrolledCollege, String userEnrollmentBranch, String userEnrollmentNumber, Integer userEnrollmentStartYear, Integer userEnrollmentEndYear) {
        this.userId = userId;
        this.userName = userName;
        this.userDisplayName = userDisplayName;
        this.userDOB = userDOB;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.userEnrolledUni = userEnrolledUni;
        this.userEnrolledCollege = userEnrolledCollege;
        this.userEnrollmentBranch = userEnrollmentBranch;
        this.userEnrollmentNumber = userEnrollmentNumber;
        this.userEnrollmentStartYear = userEnrollmentStartYear;
        this.userEnrollmentEndYear = userEnrollmentEndYear;

    }

    // For Initial Post request
    public User(String userName, String userEmail) {
        this.userName = userName;
        this.userEmail = userEmail;
    }


    public Long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDisplayName() {
        return userDisplayName;
    }

    public void setUserDisplayName(String userDisplayName) {
        this.userDisplayName = userDisplayName;
    }

    public String getUserDOB() {
        return userDOB;
    }

    public void setUserDOB(String userDOB) {
        this.userDOB = userDOB;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEnrolledUni() {
        return userEnrolledUni;
    }

    public void setUserEnrolledUni(String userEnrolledUni) {
        this.userEnrolledUni = userEnrolledUni;
    }

    public String getUserEnrolledCollege() {
        return userEnrolledCollege;
    }

    public void setUserEnrolledCollege(String userEnrolledCollege) {
        this.userEnrolledCollege = userEnrolledCollege;
    }

    public String getUserEnrollmentBranch() {
        return userEnrollmentBranch;
    }

    public void setUserEnrollmentBranch(String userEnrollmentBranch) {
        this.userEnrollmentBranch = userEnrollmentBranch;
    }

    public String getUserEnrollmentNumber() {
        return userEnrollmentNumber;
    }

    public void setUserEnrollmentNumber(String userEnrollmentNumber) {
        this.userEnrollmentNumber = userEnrollmentNumber;
    }

    public Integer getUserEnrollmentStartYear() {
        return userEnrollmentStartYear;
    }

    public void setUserEnrollmentStartYear(Integer userEnrollmentStartYear) {
        this.userEnrollmentStartYear = userEnrollmentStartYear;
    }

    public Integer getUserEnrollmentEndYear() {
        return userEnrollmentEndYear;
    }

    public void setUserEnrollmentEndYear(Integer userEnrollmentEndYear) {
        this.userEnrollmentEndYear = userEnrollmentEndYear;
    }

    public String getUserCreatedAt() {
        return userCreatedAt;
    }


    public String getUserUpdatedAt() {
        return userUpdatedAt;
    }

    public Status_enum gettingUserStatus(){
        return userStatus;
    }

    public void setUserUpdatedAt() {
        this.userUpdatedAt = String.valueOf(Instant.now().getEpochSecond());
    }

    public void setUserStatus(Status_enum userStatus) {
        this.userStatus = userStatus;
    }
}
