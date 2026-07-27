import './App.css';
import {Routes, Route} from "react-router-dom";
import HomePage from "./pages/HomePage";
import AddEmployeeModel from "./pages/AddEmployeeModel";

function App() {
  return (

      <Routes>
          <Route path="/" element={<h1>Dashboard</h1>} />
          <Route exact path="pages" element={<HomePage/>} />
          <Route exact path="pages/addEmployee" element={<AddEmployeeModel/>} />

      </Routes>

  );
}

export default App;
