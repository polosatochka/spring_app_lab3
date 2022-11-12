package com.example.spring_app_lab3.service;

import com.example.spring_app_lab3.model.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("ModifyErrorMessage")
public class ModifyErrorMessage implements ModifyService{

    @Override
    public Response modify(Response response) {
        response.setErrorMessage("Fucked up");
        return response;
    }
}
