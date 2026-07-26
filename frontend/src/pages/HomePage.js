import "./homePage.css"
import EmployeeTable from "./EmployeeTable";
import {useEffect, useState} from "react";
import axios from "axios";

function HomePage() {
    const [employees, setEmployees] = useState(null);

    useEffect(() => {
        // Fetch data from your Spring Boot backend
        axios.get("http://localhost:8080/api/employee/get-employees")
            .then((response) => {
                setEmployees(response.data);
            })
            .catch((err) => {
                console.error("Error fetching employees:", err);

            });
    }, []);

    return (
        <div >
            <header >
                <h2> Hello from the under world
                </h2>

            </header>

            <EmployeeTable employees={employees}/>
        </div>
    );
}

export default HomePage;