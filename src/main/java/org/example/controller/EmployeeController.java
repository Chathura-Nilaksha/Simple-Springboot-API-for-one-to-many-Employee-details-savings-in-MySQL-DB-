package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.EmployeeDto;
import org.example.entity.EmployeeEntity;
import org.example.repository.AddressRepository;
import org.example.repository.EmployeeRepository;
import org.example.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

//1toM
@RestController
//@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {
//    final EmployeeService employeeService;
    final EmployeeRepository employeeRepository;
    @PostMapping("/saveEmployees")
//    public ResponseEntity<String> saveEmployees(@RequestBody List<EmployeeDto> empData){
    public void saveEmployees(@RequestBody List<EmployeeEntity> empData){
//        return employeeService.saveEmployees(empData) ;
        employeeRepository.saveAll(empData) ;
    }
}


//List -from util in the v

// check net ????
//@Transactional anotatn as at entity cls-
//@OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_add_id")