# WALAB_Project1

## 인프런 강의 관리 프로그램

### 구현 기능
- 강의 등록: 강의 제목, 강사, 태그, 평점을 입력하여 새로운 강의를 등록할 수 있습니다.
- 강의 목록: 현재 등록된 모든 강의를 조회할 수 있습니다.
- 강의 수정: 강의 번호를 입력하여, 해당 강의의 정보를 수정할 수 있습니다.
- 강의 삭제: 강의 번호를 입력하여, 해당 강의를 삭제할 수 있습니다.
- 강의명 검색: 검색어를 입력하여, 강의명에서 검색어를 포함하는 모든 강의를 조회할 수 있습니다.
- 별점순 검색: 별점순으로 내림차순 정렬하여, 강의를 조회할 수 있습니다.

### 외부 라이브러리
- Lombok: 자바 클래스에서 getter, setter, NoArgsConstructor의 반복 코드를 줄이기 위해 사용하였습니다.

### 패키지
- MVC 패턴을 사용하여 패키지를 구성했습니다.
- model: 강의 데이터 Schema
- view: 강의 관리 인터페이스
- controller: 강의 관리 로직 구현

### 클래스
- `Main`: 프로그램을 실행합니다.
- `Lecture`: 강의 데이터의 Schema를 정의합니다.
- `LectureController`: 강의 데이터 관리 로직을 구현하고 있습니다.
- `LectureView`: 강의 데이터 관리를 위한 인터페이스를 제공합니다.

### 스크린샷
<img width="593" alt="image" src="https://github.com/eunoia-jason/WALAB_Project1/assets/62330979/a5af0613-9c75-444f-8c66-9843d55d58e8">
<img width="661" alt="image" src="https://github.com/eunoia-jason/WALAB_Project1/assets/62330979/4ed8eec1-5fe0-4a4b-9107-c5710049e8a5">
<img width="665" alt="image" src="https://github.com/eunoia-jason/WALAB_Project1/assets/62330979/7b3a1ffa-b38f-45c7-ba1e-3db9a77fe3e6">
<img width="663" alt="image" src="https://github.com/eunoia-jason/WALAB_Project1/assets/62330979/696f75fa-9d47-4581-9d7a-2b9418cffb3f">
