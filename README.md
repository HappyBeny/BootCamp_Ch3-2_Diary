# BootCamp_Ch3-2_Diary
# 0️⃣목차
## 1️⃣ 프로젝트 설명
## 2️⃣ API 명세서
## 3️⃣ ERD
## 4️⃣ 구현한 기능
## 5️⃣ 클래스/메서드 설명
## 6️⃣기술 스택
<br><br><br>


## 1️⃣ 프로젝트 설명

간단한 수준에서 **회원**과 **일정**을 관리할 수 있는 웹 애플리케이션  
회원은 일정과 연결되어 있으며, 일정은 각 회원에게 속해 있음.

---

### **`member` 테이블**

- **`id`**  
  고유 식별자로, 사용자가 입력하는 것이 아니라 **DB에서 자동으로 부여**된다.  
- **`email`**  
  회원의 이메일 주소로, **VARCHAR(255)** 타입의 값이다.  
- **`username`**  
  회원의 이름으로, **VARCHAR(255)** 타입의 값이다.  
- **`created_date`**  
  생성일자로, **DATETIME(6)** 타입의 값이다.  
- **`updated_date`**  
  수정일자로, **DATETIME(6)** 타입의 값이다.  

---

### **`schedule` 테이블**

- **`id`**  
  고유 식별자로, 사용자가 입력하는 것이 아니라 **DB에서 자동으로 부여**된다.  
- **`schedule`**  
  일정 내용으로, **VARCHAR(255)** 타입의 값이다.  
- **`description`**  
  일정에 대한 설명으로, **VARCHAR(255)** 타입의 값이다.  
- **`member_id`**  
  이 일정이 속한 회원의 ID로, **BIGINT** 타입의 값이다.  
- **`created_date`**  
  생성일자로, **DATETIME(6)** 타입의 값이다.  
- **`updated_date`**  
  수정일자로, **DATETIME(6)** 타입의 값이다.  
<br><br>

## 2️⃣ API 명세서
https://documenter.getpostman.com/view/40135026/2sAYJ1mNoP
<br><br>

## 3️⃣ ERD(Entity-Relationship Diagram)
![image](https://github.com/user-attachments/assets/ccb51bd9-6d34-4a7a-98e3-92116145a4ab)
<br><br>


## 4️⃣ 구현한 기능

### 🧾 **회원 관리**

#### **회원가입**
- **경로**: `/members/signup` (**POST**)  
- **설명**: 새로운 회원을 생성합니다.

#### **로그인**
- **경로**: `/members/login` (**POST**)  
- **설명**: 세션을 생성하고 로그인합니다.

#### **로그아웃**
- **경로**: `/members/logout` (**POST**)  
- **설명**: 세션을 무효화하고 로그아웃합니다.

#### **회원 조회**
- **경로**: `/members/{id}` (**GET**)  
- **설명**: 특정 회원의 정보를 조회합니다.

#### **회원 정보 수정**
- **경로**: `/members/{id}` (**PATCH**)  
- **설명**: 회원 정보를 수정합니다.

#### **회원 삭제**
- **경로**: `/members/{id}` (**DELETE**)  
- **설명**: 비밀번호 확인 후 회원을 삭제합니다.

---

### 📅 **일정 관리**

#### **일정 생성**
- **경로**: `/schedules` (**POST**)  
- **설명**: 새로운 일정을 생성합니다.

#### **일정 목록 조회**
- **경로**: `/schedules` (**GET**)  
- **설명**: 모든 일정을 조회합니다.

#### **특정 일정 조회**
- **경로**: `/schedules/{id}` (**GET**)  
- **설명**: 특정 일정의 정보를 조회합니다.

#### **일정 수정**
- **경로**: `/schedules/{id}` (**PATCH**)  
- **설명**: 일정을 수정합니다.

#### **일정 삭제**
- **경로**: `/schedules/{id}` (**DELETE**)  
- **설명**: 비밀번호 확인 후 일정을 삭제합니다.
<br><br>

## 5️⃣ 클래스/메서드 설명

**<details><summary>Entity</summary>**
- **Member**: 회원 정보를 표현하는 엔티티 클래스  
  - **`id`**: 회원 ID (Long)  
  - **`username`**: 사용자 이름 (String)  
  - **`email`**: 이메일 (String)  
  - **`password`**: 비밀번호 (String)  
  - **`createdDate`**: 생성 날짜 (LocalDateTime)  
  - **`updatedDate`**: 수정 날짜 (LocalDateTime)  

- **Schedule**: 일정 정보를 표현하는 엔티티 클래스  
  - **`id`**: 일정 ID (Long)  
  - **`schedule`**: 일정 제목 (String)  
  - **`description`**: 일정 설명 (String)  
  - **`writer`**: 작성자 (String)  
  - **`createdDate`**: 생성 날짜 (LocalDateTime)  
  - **`updatedDate`**: 수정 날짜 (LocalDateTime)  
</details>

---

### **<details><summary>DTO</summary>**

- **CreateMemberRequestDto**: 회원 생성 요청 시 사용  
  - `username`: 사용자 이름 (String)  
  - `email`: 이메일 (String)  
  - `password`: 비밀번호 (String)  

- **CreateScheduleRequestDto**: 일정 생성 요청 시 사용  
  - `schedule`: 일정 제목 (String)  
  - `description`: 일정 설명 (String)  
  - `password`: 비밀번호 (String)  

- **UpdateUserRequestDto**: 회원 정보 수정 요청 시 사용  
  - `username`: 새로운 사용자 이름 (String)  
  - `oldPassword`: 기존 비밀번호 (String)  
  - `newPassword`: 새로운 비밀번호 (String)  

- **UpdateScheduleRequestDto**: 일정 수정 요청 시 사용  
  - `schedule`: 새로운 일정 제목 (String)  
  - `description`: 새로운 일정 설명 (String)  
  - `password`: 비밀번호 (String)  

- **DeleteMemberRequestDto**: 회원 삭제 요청 시 사용  
  - `password`: 비밀번호 (String)  

- **DeleteScheduleRequestDto**: 일정 삭제 요청 시 사용  
  - `password`: 비밀번호 (String)  

- **MemberResponseDto**: 회원 조회 응답용  
  - `id`: 회원 ID (Long)  
  - `username`: 사용자 이름 (String)  
  - `email`: 이메일 (String)  

- **ScheduleResponseDto**: 일정 조회 응답용  
  - `id`: 일정 ID (Long)  
  - `schedule`: 일정 제목 (String)  
  - `description`: 일정 설명 (String)  
  - `writer`: 작성자 (String)  

</details>

---

### **<details><summary>Repository</summary>**

- **MemberRepository**: 회원 데이터 접근을 위한 인터페이스  
  - **`findByIdOrElseThrow(Long id)`**  
    - ID로 회원을 조회하고 없으면 예외 발생  

- **ScheduleRepository**: 일정 데이터 접근을 위한 인터페이스  
  - **`findByIdOrElseThrow(Long id)`**  
    - ID로 일정을 조회하고 없으면 예외 발생  

</details>

---

### **<details><summary>Service</summary>**

- **MemberService**  
  - **`createMember(CreateMemberRequestDto requestDto)`**  
    - 새로운 회원을 생성합니다.  

  - **`updateUserInfo(HttpSession session, Long id, UpdateUserRequestDto requestDto)`**  
    - 로그인된 회원 정보를 수정합니다.  

  - **`softDelete(HttpSession session, Long id, DeleteMemberRequestDto requestDto)`**  
    - 회원 정보를 소프트 삭제합니다.  

- **ScheduleService**  
  - **`create(CreateScheduleRequestDto requestDto, String username)`**  
    - 새로운 일정을 생성합니다.  

  - **`update(HttpSession session, Long id, UpdateScheduleRequestDto requestDto)`**  
    - 일정을 수정합니다.  

  - **`delete(HttpSession session, Long id, DeleteScheduleRequestDto requestDto)`**  
    - 일정을 삭제합니다.  

</details>

---

### **<details><summary>Controller</summary>**

- **MemberController**  
  - **`signup(CreateMemberRequestDto requestDto)`**  
    - 회원 가입을 처리합니다.  

  - **`updateUserInfo(Long id, UpdateUserRequestDto requestDto)`**  
    - 회원 정보를 수정합니다.  

  - **`deleteMember(Long id, DeleteMemberRequestDto requestDto)`**  
    - 회원을 삭제합니다.  

- **ScheduleController**  
  - **`createSchedule(CreateScheduleRequestDto requestDto)`**  
    - 일정을 생성합니다.  

  - **`updateSchedule(Long id, UpdateScheduleRequestDto requestDto)`**  
    - 일정을 수정합니다.  

  - **`deleteSchedule(Long id, DeleteScheduleRequestDto requestDto)`**  
    - 일정을 삭제합니다.  

</details>

---

### **<details><summary>Configuration</summary>**

- **WebConfig**  
  - **`authFilter()`**  
    - 인증 필터를 등록하여 모든 요청에 대해 인증을 수행합니다.  

</details>
