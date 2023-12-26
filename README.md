# WALAB_Project1

## 인프런 강의 관리 프로그램

### 구현 기능
- 강의 등록: 강의 제목, 강사, 태그, 평점을 입력하여 새로운 강의를 등록할 수 있습니다.
- 강의 목록: 현재 등록된 모든 강의를 조회할 수 있습니다.
- 강의 수정: 강의 번호를 입력하여, 해당 강의의 정보를 수정할 수 있습니다.
- 강의 삭제: 강의 번호를 입력하여, 해당 강의를 삭제할 수 있습니다.
- 강의명 검색: 검색어를 입력하여, 강의명에서 검색어를 포함하는 모든 강의를 조회할 수 있습니다.

### 외부 라이브러리
- Lombok: 자바 클래스에서 getter, setter, NoArgsConstructor의 반복 코드를 줄이기 위해 사용하였습니다.

### 패키지
- MVC 패턴을 사용하여 패키지를 구성했습니다.
- model: 강의 데이터 Schema
- view: 강의 관리 인터페이스
- controller: 강의 관리 로직 구현

### 클래스
- `Main`: 프로그램을 실행합니다.
- `Lecture`: 강의 데이터의 Schema를 정의합니다.
- `LectureController`: 강의 데이터 관리 로직을 구현하고 있습니다.
- `LectureView`: 강의 데이터 관리를 위한 인터페이스를 제공합니다.

### 스크린샷
<img width="506" alt="image" src="https://github.com/eunoia-jason/WALAB_Project1/assets/62330979/831817a9-8c6e-45a4-9977-2aee1afa939f">
<img width="672" alt="image" src="https://github.com/eunoia-jason/WALAB_Project1/assets/62330979/e4603f1b-9fd4-4500-8b79-68cacf7534ec">
<img width="712" alt="image" src="https://github.com/eunoia-jason/WALAB_Project1/assets/62330979/0d1e3015-f995-4e07-b1e1-fb194a4f5d7d">
<img width="714" alt="image" src="https://github.com/eunoia-jason/WALAB_Project1/assets/62330979/8993a7bb-1b3a-4fa3-9334-9188eeae7675">
