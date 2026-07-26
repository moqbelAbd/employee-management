package moqbel.employeemanagmrnt.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import moqbel.employeemanagmrnt.dto.GetEmployeesResponse;
import moqbel.employeemanagmrnt.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("api/employee")
@RequiredArgsConstructor

//@CrossOrigin
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping ("get-employees")
    public ResponseEntity <List<GetEmployeesResponse>> getEmployees() {
        return ResponseEntity.ok(employeeService.getEmployees());
    }
}
