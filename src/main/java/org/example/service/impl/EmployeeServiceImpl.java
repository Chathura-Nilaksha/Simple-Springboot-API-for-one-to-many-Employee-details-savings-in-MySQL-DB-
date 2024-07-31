package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.EmployeeDto;
import org.example.entity.EmployeeEntity;
import org.example.repository.EmployeeRepository;
import org.example.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {
    final EmployeeRepository employeeRepository;
    final ModelMapper modelMapper;
//    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }

    @Override
    public ResponseEntity<String> saveEmployees(List<EmployeeDto> empData) {
        List<EmployeeEntity> employeeEntityList = Collections.singletonList(modelMapper.map(empData, EmployeeEntity.class));
        employeeRepository.saveAll(employeeEntityList);
        return ResponseEntity.ok("Data saved successfully");
    }
}
