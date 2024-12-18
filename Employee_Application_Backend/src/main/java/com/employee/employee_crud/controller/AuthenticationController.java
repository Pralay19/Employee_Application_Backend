package com.employee.employee_crud.controller;


import com.employee.employee_crud.dto.LoginRequest;
import com.employee.employee_crud.helpers.JWTHelper;
import com.employee.employee_crud.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/iiitb/Employee")
public class AuthenticationController {
    private final EmployeeService employeeService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {
//        try {
//            String token = employeeService.loginEmployee(request);
//            String email = jwtHelper.extractEmail(token);
//            HttpHeaders headers = new HttpHeaders();
//            headers.setLocation(URI.create("/iiitb/Employee/profile/" + email));
//            headers.set("Authorization", "Bearer " + token);
//
//            return new ResponseEntity<>(headers, HttpStatus.SEE_OTHER);
//        } catch (ResponseStatusException ex) {
//            return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
//        }
        String token = employeeService.loginEmployee(request);
        System.out.println(token);
        return ResponseEntity.ok(token);
    }
}
