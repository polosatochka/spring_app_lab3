package com.example.spring_app_lab3.service;

import com.example.spring_app_lab3.model.Response;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("ModifyUid")
public class ModifyUid implements ModifyService{

    @Override
    public Response modify(Response response) {

        response.setUId("NewUid");

        return response;
    }
}
