package com.Edfoal.user_service.Utilities;
public enum Status_enum{
    VERIFIED("1"),
    NOT_VERIFIED("0"),
    REJECTED("-1");
    private String status_code;

    private Status_enum(String status_code) {
        this.status_code = status_code;
    }

    public String getStatus(){
        return this.name();
    }
}
