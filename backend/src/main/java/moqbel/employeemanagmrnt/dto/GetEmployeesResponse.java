package moqbel.employeemanagmrnt.dto;

import java.util.UUID;

public record GetEmployeesResponse(UUID employeeID,
                                   String firstName,
                                   String lastName,
                                   String email) {

}
