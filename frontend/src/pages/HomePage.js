import "./homePage.css"
import EmployeeTable from "./EmployeeTable";
import {useEffect, useState} from "react";
import axios from "axios";
import AddEmployeeModel from "./AddEmployeeModel";

function HomePage() {
    const [employees, setEmployees] = useState(null);

    useEffect(() => {


        axios.get("http://localhost:8080/api/employee/get-employees")
            .then((response) => {
                setEmployees(response.data);
            })
            .catch((err) => {
                console.error("Error fetching employees:", err);

            });
    }, []);

    return (
        <div className="container">
            <header >
                <h2> Hello from the under world
                </h2>

            </header>

            <EmployeeTable employees={employees}/>
            {/*<AddEmployeeModel />*/}
        </div>
    );
}

export default HomePage;