# spring-core-basic-pjt
Inflearn 스프링 핵심 원리 기본편의 실습 프로젝트를 기록한 것입니다.

## 구현방식

### 순수 JAVA

- IDE : IntelliJ
- Project : Gradle
- Spring Boot : 2.7.5
- Languge : JAVA
- Packaging : Jar
- Java : 11

## 비즈니스 요구사항과 설계
- 회원
  - 회원을 가입하고 조회할 수 있다.
  - 회원은 일반 / VIP 등급이 있다.
  - 회원 데이터는 자체 DB를 구축할 수 있고, 외부 시스템과 연동할 수도 있다.
- 주문과 할인 정책
  - 회원은 상품을 주문할 수 있다.
  - 회원 등급에 따라 할인 정책을 적용할 수 있다.
  - VIP는 1000원을 할인해주는 고정 금액 할인을 적용한다.
  - 할인 정책은 변경 가능성이 높다. 최악의 경우 할인을 적용하지 않을 수도 있다.

### 회원 도메인 설계 
#### 회원 도메인 협력 관계
  ![img.png](img/img.png)
  
#### 회원 클래스 다이어그램
![img_1.png](img/img_1.png)
#### 회원 객체 다이어그램
![img_2.png](img/img_2.png)
- 회원 서비스 : MemberServiceImpl