package moqbel.employeemanagmrnt.dto;

import java.util.UUID;

public record AddEmployeeRequest(
                                 String firstName,
                                 String lastName,
                                 String email) {
}
