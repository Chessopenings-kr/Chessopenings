import React from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import './App.css';
import MainPage from './pages/MainPage.jsx';

function App() {
  return (
    <div>
      <BrowserRouter>
        <Routes>
          <Route path="/main" element={<MainPage />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
