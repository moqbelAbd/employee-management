package moqbel.employeemanagmrnt.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import moqbel.employeemanagmrnt.dto.GetEmployeesResponse;
import moqbel.employeemanagmrnt.dto.AddEmployeeRequest;
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

    @PostMapping("add-employee")
    public  ResponseEntity <String> addEmployees
            (@RequestBody AddEmployeeRequest addEmployeeRequest) {
        employeeService.addEmployees(addEmployeeRequest);
        return ResponseEntity.ok("Added successfully");
    }


}
