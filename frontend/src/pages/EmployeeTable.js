import "./EmployeeTable.css";

function EmployeeTable({ employees }) {


    return (
        <div className="container">
            <table className="table-container">
                <thead className="data-table">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Email</th>
                </tr>
                </thead>
                <tbody className="data-table">
                {employees && employees.length > 0 ? (
                    employees.map((emp) => (
                        <tr key={emp.employeeID}>
                            <td>{emp.employeeID}</td>
                            <td>{`${emp.firstName} ${emp.lastName}`}</td>
                            <td>{emp.email}</td>
                        </tr>
                    ))
                ) : (
                    <tr>
                        <td colSpan="3" style={{ textAlign: "center" }}>
                            No employees found.
                        </td>
                    </tr>
                )}
                </tbody>
            </table>
        </div>
    );
}

export default EmployeeTable;