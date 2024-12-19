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

<details><summary><b>Entity</b></summary>

<ul>
  <li><b>Member</b>
    <ul>
      <li><code>id</code>: 회원 ID (Long)</li>
      <li><code>username</code>: 사용자 이름 (String)</li>
      <li><code>email</code>: 이메일 (String)</li>
      <li><code>password</code>: 비밀번호 (String)</li>
      <li><code>createdDate</code>: 생성 날짜 (LocalDateTime)</li>
      <li><code>updatedDate</code>: 수정 날짜 (LocalDateTime)</li>
    </ul>
  </li>
  <li><b>Schedule</b>
    <ul>
      <li><code>id</code>: 일정 ID (Long)</li>
      <li><code>schedule</code>: 일정 제목 (String)</li>
      <li><code>description</code>: 일정 설명 (String)</li>
      <li><code>writer</code>: 작성자 (String)</li>
      <li><code>createdDate</code>: 생성 날짜 (LocalDateTime)</li>
      <li><code>updatedDate</code>: 수정 날짜 (LocalDateTime)</li>
    </ul>
  </li>
</ul>

</details>

---

### **<details><summary>DTO</summary>**

<ul>
  <li><b>CreateMemberRequestDto</b>
    <ul>
      <li><code>username</code>: 사용자 이름 (String)</li>
      <li><code>email</code>: 이메일 (String)</li>
      <li><code>password</code>: 비밀번호 (String)</li>
    </ul>
  </li>
  <li><b>CreateScheduleRequestDto</b>
    <ul>
      <li><code>schedule</code>: 일정 제목 (String)</li>
      <li><code>description</code>: 일정 설명 (String)</li>
      <li><code>password</code>: 비밀번호 (String)</li>
    </ul>
  </li>
  <li><b>UpdateUserRequestDto</b>
    <ul>
      <li><code>username</code>: 새로운 사용자 이름 (String)</li>
      <li><code>oldPassword</code>: 기존 비밀번호 (String)</li>
      <li><code>newPassword</code>: 새로운 비밀번호 (String)</li>
    </ul>
  </li>
  <li><b>UpdateScheduleRequestDto</b>
    <ul>
      <li><code>schedule</code>: 새로운 일정 제목 (String)</li>
      <li><code>description</code>: 새로운 일정 설명 (String)</li>
      <li><code>password</code>: 비밀번호 (String)</li>
    </ul>
  </li>
  <li><b>DeleteMemberRequestDto</b>
    <ul>
      <li><code>password</code>: 비밀번호 (String)</li>
    </ul>
  </li>
  <li><b>DeleteScheduleRequestDto</b>
    <ul>
      <li><code>password</code>: 비밀번호 (String)</li>
    </ul>
  </li>
  <li><b>MemberResponseDto</b>
    <ul>
      <li><code>id</code>: 회원 ID (Long)</li>
      <li><code>username</code>: 사용자 이름 (String)</li>
      <li><code>email</code>: 이메일 (String)</li>
    </ul>
  </li>
  <li><b>ScheduleResponseDto</b>
    <ul>
      <li><code>id</code>: 일정 ID (Long)</li>
      <li><code>schedule</code>: 일정 제목 (String)</li>
      <li><code>description</code>: 일정 설명 (String)</li>
      <li><code>writer</code>: 작성자 (String)</li>
    </ul>
  </li>
</ul>

</details>

---

### **<details><summary>Repository</summary>**

<ul>
  <li><b>MemberRepository</b>
    <ul>
      <li><code>findByIdOrElseThrow(Long id)</code>: ID로 회원을 조회하고 없으면 예외 발생</li>
    </ul>
  </li>
  <li><b>ScheduleRepository</b>
    <ul>
      <li><code>findByIdOrElseThrow(Long id)</code>: ID로 일정을 조회하고 없으면 예외 발생</li>
    </ul>
  </li>
</ul>

</details>

---

### **<details><summary>Service</summary>**

<ul>
  <li><b>MemberService</b>
    <ul>
      <li><code>createMember(CreateMemberRequestDto requestDto)</code>: 새로운 회원을 생성합니다.</li>
      <li><code>updateUserInfo(HttpSession session, Long id, UpdateUserRequestDto requestDto)</code>: 로그인된 회원 정보를 수정합니다.</li>
      <li><code>softDelete(HttpSession session, Long id, DeleteMemberRequestDto requestDto)</code>: 회원 정보를 소프트 삭제합니다.</li>
    </ul>
  </li>
  <li><b>ScheduleService</b>
    <ul>
      <li><code>create(CreateScheduleRequestDto requestDto, String username)</code>: 새로운 일정을 생성합니다.</li>
      <li><code>update(HttpSession session, Long id, UpdateScheduleRequestDto requestDto)</code>: 일정을 수정합니다.</li>
      <li><code>delete(HttpSession session, Long id, DeleteScheduleRequestDto requestDto)</code>: 일정을 삭제합니다.</li>
    </ul>
  </li>
</ul>

</details>

---

### **<details><summary>Controller</summary>**

<ul>
  <li><b>MemberController</b>
    <ul>
      <li><code>signup(CreateMemberRequestDto requestDto)</code>: 회원 가입을 처리합니다.</li>
      <li><code>updateUserInfo(Long id, UpdateUserRequestDto requestDto)</code>: 회원 정보를 수정합니다.</li>
      <li><code>deleteMember(Long id, DeleteMemberRequestDto requestDto)</code>: 회원을 삭제합니다.</li>
    </ul>
  </li>
  <li><b>ScheduleController</b>
    <ul>
      <li><code>createSchedule(CreateScheduleRequestDto requestDto)</code>: 일정을 생성합니다.</li>
      <li><code>updateSchedule(Long id, UpdateScheduleRequestDto requestDto)</code>: 일정을 수정합니다.</li>
      <li><code>deleteSchedule(Long id, DeleteScheduleRequestDto requestDto)</code>: 일정을 삭제합니다.</li>
    </ul>
  </li>
</ul>

</details>

---

### **<details><summary>Configuration</summary>**

<ul>
  <li><b>WebConfig</b>
    <ul>
      <li><code>authFilter()</code>: 인증 필터를 등록하여 모든 요청에 대해 인증을 수행합니다.</li>
    </ul>
  </li>
</ul>

</details>
