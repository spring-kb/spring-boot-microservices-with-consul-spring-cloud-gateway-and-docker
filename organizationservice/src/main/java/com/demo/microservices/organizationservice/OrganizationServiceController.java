package com.demo.microservices.organizationservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/organization")
public class OrganizationServiceController {

    @GetMapping("/getOrganizationDetails")
    public ResponseEntity<String> getOrganizationDetails() {
        String returnObject = "{\"organizationId\":\"1\",\"name\":\"Organization\"}";

        return new ResponseEntity<String>(returnObject, HttpStatus.OK);
    }
}