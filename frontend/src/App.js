import './App.css';
import {Routes, Route} from "react-router-dom";
import HomePage from "./pages/HomePage";

function App() {
  return (

      <Routes>
          <Route path="/" element={<h1>Dashboard</h1>} />
          <Route exact path="pages" element={<HomePage/>} />

      </Routes>

  );
}

export default App;
