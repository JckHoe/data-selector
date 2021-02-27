package com.selector.controller;

import com.selector.constant.StatusEnum;
import com.selector.model.response.BaseResponse;

public interface BaseController {
    default <T extends BaseResponse> T handleResponse(T response){
        response.setStatus(StatusEnum.SUCCESS.name());
        return response;
    }
}
