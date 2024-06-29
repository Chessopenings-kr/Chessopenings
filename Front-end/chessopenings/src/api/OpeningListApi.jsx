// 함수 정의: 백엔드 서버에서 JSON 데이터를 가져와서 처리하는 함수
async function fetchOpeningList() {
    try {
      const response = await fetch(`${process.env.REACT_APP_API_URL}/opening`);
      if (!response.ok) {
        throw new Error('Network response was not ok');
      }
      const data = await response.json(); // JSON 형식으로 파싱된 데이터
      console.log(data);
      // 데이터가 제대로 파싱되었는지 확인 후 처리
      if (data && data.openings) {
        const openings = data.openings;
        console.log('Parsed notation array:', openings); // 배열 출력 예시
        return openings;
      } else {
        throw new Error('Invalid data structure from server');
      }
    } catch (error) {
      console.error('Error fetching data:', error.message);
      // 필요에 따라 에러 처리를 할 수 있음 (예: 사용자에게 알림 등)
      return []; // 에러 발생 시 빈 배열 반환 또는 다른 기본값 설정
    }
  }