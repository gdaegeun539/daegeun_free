# Infobility - backend
목차
* 프로젝트 소개
* 기술 스택
* 구현 기능
	* 전체 전자기기 조회
	* 제조사 별 전자기기 조회
	* 전자기기 상세 정보 조회 및 리뷰 조회
	* 전자기기 추가
* DB 스키마
* 배운 점 & 아쉬운 점
	* 배운 점
	* 아쉬운 점
* 라이선스

## 프로젝트 소개

<p align="justify">
교내 과목 "프레임워크프로그래밍" 최종 과제로 제작한 전자기기 정보 조회 서비스 및 사용자 리뷰 작성 서비스입니다.
</p>

<br>

## 기술 스택

|  Java   |  Spring   |  MySQL   |                                             MyBatis                                             | Intellij IDEA |
|:-------:|:---------:|:--------:|:-----------------------------------------------------------------------------------------------:|:-------------:|
| ![java] | ![spring] | ![mysql] | <img src="https://github.com/mybatis/logo/blob/master/logo-bird-ninja.png?raw=true" width=50 /> |  ![intellij]  |

<br>

## 구현 기능

### 전체 전자기기 조회
![all_view](/readme_assets/all_view.png)

<br/>

### 제조사 별 전자기기 조회
![manufacturer_view](/readme_assets/manufacturer_view.png)

<br/>

### 전자기기 상세 정보 조회 및 리뷰 조회
![desc_review1](/readme_assets/desc_review1.png)
![desc_review2](/readme_assets/desc_review2.png)

<br/>

### 전자기기 추가
![add_dev](/readme_assets/add_dev.png)

<br/>

## DB 스키마

<p align="center">
  <br>
  <img src="/readme_assets/DB%20Scheme.jpg" alt="Infobility DB Schema">
  <br>
</p>

## 배운 점 & 아쉬운 점

### 배운 점
<p align="justify">

* 간단히 요구사항을 정리하고 이에 따라 기능을 정리할 수 있었음
* Spring MVC의 기본적인 작동 원리를 적용할 수 있었음
* MyBatis등의 SQL Wrapper 계열 ORM을 사용해볼 수 있었음
* RESTful의 개념을 일부 적용해볼 수 있었음

</p>

### 아쉬운 점
<p align="justify">

* Swagger를 적용하여 API 문서를 제작하려 했으나 시간이 부족하여 하지 못한 것이 아쉬움
* 기기 목록에 Pagination을 적용하지 못한 것이 아쉬움
* 이미지 업로드를 구현하지 못한 점이 아쉬움

</p>

<br>

## 라이센스

MIT &copy; [gdaegeun539](mailto:gdaegeun539@gmail.com)

<!-- Stack Icon References -->

[java]: https://www.vectorlogo.zone/logos/java/java-icon.svg
[spring]: https://www.vectorlogo.zone/logos/springio/springio-icon.svg
[mysql]: https://www.vectorlogo.zone/logos/mysql/mysql-icon.svg
[intellij]: https://resources.jetbrains.com/storage/products/company/brand/logos/IntelliJ_IDEA_icon.svg
