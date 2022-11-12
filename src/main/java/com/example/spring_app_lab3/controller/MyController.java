package com.example.spring_app_lab3.controller;

import com.example.spring_app_lab3.model.Request;
import com.example.spring_app_lab3.model.Response;
import com.example.spring_app_lab3.service.ModifyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MyController {

    private final ModifyService modifyService;

    public MyController(@Qualifier("ModifyErrorMessage") ModifyService modifyService){
        this.modifyService = modifyService;
    }

    @PostMapping(value = "/feedback")
    public ResponseEntity<Response> feedback(@RequestBody Request request){
        log.info("Входящий request : " + String.valueOf(request));

        Response response = Response.builder()
                .uId(request.getUId())
                .operationUId(request.getOperationUId())
                .systemTime(request.getSystemTime())
                .code("successful")
                .errorCode("")
                .errorMessage("")
                .build();

        Response responseAfterModification = modifyService.modify(response);
        log.info("Исходящий response : " + String.valueOf(response));

        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}
