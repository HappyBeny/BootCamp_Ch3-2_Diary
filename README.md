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


<br><br><br>
Lv4 API 명세서 : https://documenter.getpostman.com/view/40135026/2sAYJ1mNoP
