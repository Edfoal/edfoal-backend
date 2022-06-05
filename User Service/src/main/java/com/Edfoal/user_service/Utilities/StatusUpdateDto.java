package com.Edfoal.user_service.Utilities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StatusUpdateDto {

    private Long userId;

    @JsonProperty("userStatus")
    private Status_enum status_enum;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Status_enum getStatus_enum() {
        return status_enum;
    }

    public void setStatus_enum(Status_enum status_enum) {
        this.status_enum = status_enum;
    }
}
