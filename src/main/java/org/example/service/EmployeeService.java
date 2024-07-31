package org.example.service;

import org.example.dto.EmployeeDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeService {
    ResponseEntity<String> saveEmployees(List<EmployeeDto> empData);
}
