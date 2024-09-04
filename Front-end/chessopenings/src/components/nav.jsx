import React, { useState, useEffect } from "react";
import { useNavigate } from 'react-router-dom';
import '../styles/nav.css';
import { useRecoilValue } from "recoil";

const Nav = () => {
  const navigate = useNavigate();

  return (
    <div className="header">
      <div className="header-left">
        <div className="logo">
        </div>
        <nav className="nav">
          <a onClick={() => navigate('/main')}>또박이</a>
          <a onClick={() => navigate('/levels')}>난이도별 문제</a>
          <a onClick={() => navigate('/levels_category')}>유형별 문제</a>
          <a onClick={() => navigate('/quiz-intro')}>테스트</a>
          <a onClick={() => navigate('/랭킹')}>랭킹</a>
        </nav>
      </div>
      <div className="header-right">
        </div>
    </div>
  );
};

export default Nav;
