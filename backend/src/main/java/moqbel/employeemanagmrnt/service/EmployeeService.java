package moqbel.employeemanagmrnt.service;

import lombok.RequiredArgsConstructor;
import moqbel.employeemanagmrnt.dto.GetEmployeesResponse;
import moqbel.employeemanagmrnt.dto.AddEmployeeRequest;
import moqbel.employeemanagmrnt.model.Employee;
import moqbel.employeemanagmrnt.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Transactional(readOnly = true)
    public List<GetEmployeesResponse> getEmployees() {
        return employeeRepository.findAll().
                stream()
                .map(this::mapToResponse).toList();
    }

    private GetEmployeesResponse mapToResponse(Employee emp) {
        return new GetEmployeesResponse(
                emp.getEmployeeId(),
                emp.getFirstName(),
                emp.getLastName(),
                emp.getEmail()
        );
    }

    @Transactional
    public void addEmployees( AddEmployeeRequest request) {

        Employee newEmployee = Employee.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .password("defaultPassword123")
                .build();

        employeeRepository.saveAndFlush(newEmployee);

    }

    }

