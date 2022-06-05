package com.Edfoal.user_service.Utilities;


import com.fasterxml.jackson.annotation.JsonProperty;

public class UserPostDto {

    public UserPostDto() {
    }

    @JsonProperty("userId")
    private Long userID;

    @JsonProperty("userName")
    private  String userName;

    @JsonProperty("userEmail")
    private String userEmail;

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }


}
