package com.example.spring_app_lab3.model;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Builder
public class Response {

    private String uId;
    private String operationUId;
    private String systemTime;
    private String code;
    private String errorCode;
    private String errorMessage;
}
