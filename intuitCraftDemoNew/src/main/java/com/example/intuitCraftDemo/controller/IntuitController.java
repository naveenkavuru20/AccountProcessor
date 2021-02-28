package com.example.intuitCraftDemo.controller;

import com.example.intuitCraftDemo.entity.Account;
import com.example.intuitCraftDemo.respository.UserRepository;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.errors.ApiException;
import com.google.maps.model.GeocodingResult;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.IOException;

@RestController
@RequestMapping("/user")
@Api(value = "/user", tags = {"account"}, description = "Rest API for Actions at specific Accounts")
@EnableSwagger2
@Validated
public class IntuitController {

    @Autowired
    UserRepository userRepository;

    @PostMapping(produces = "application/json")
    public ResponseEntity createAccount(@RequestBody Account account) throws InterruptedException, ApiException, IOException {
        Account user = userRepository.findAccountByEmailAddress(account.getEmailAddress());

        // TODO: need some sample address validation api open source.
//        GeoApiContext context = new GeoApiContext.Builder()
//                .apiKey("AIza...")
//                .build();
//        GeocodingResult[] results =  GeocodingApi.geocode(context,
//                "1600 Amphitheatre Parkway Mountain View, CA 94043").await();
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        System.out.println(gson.toJson(results[0].addressComponents));
        if (user != null)
            return new ResponseEntity<>("Duplicate Exception", HttpStatus.BAD_REQUEST);
        userRepository.save(account);
        return new ResponseEntity<>("Created", HttpStatus.CREATED);
    }

}

