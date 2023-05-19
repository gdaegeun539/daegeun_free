plugins {
    id("java")
    id("war")
}

group = "xyz.device"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    /* BASIC SPRING */
    // https://mvnrepository.com/artifact/org.springframework/spring-webmvc
    implementation("org.springframework:spring-webmvc:5.2.24.RELEASE")
    // https://mvnrepository.com/artifact/org.springframework/spring-core
    implementation("org.springframework:spring-core:5.2.24.RELEASE")

    /* DB CONNECTIONS */
    // https://mvnrepository.com/artifact/com.mysql/mysql-connector-j
    implementation("com.mysql:mysql-connector-j:8.0.33")
    // https://mvnrepository.com/artifact/org.mybatis/mybatis
    implementation("org.mybatis:mybatis:3.5.13")
    // https://mvnrepository.com/artifact/org.mybatis/mybatis-spring
    implementation("org.mybatis:mybatis-spring:3.0.1")
    // https://mvnrepository.com/artifact/commons-dbcp/commons-dbcp
    implementation("commons-dbcp:commons-dbcp:1.4")
    // https://mvnrepository.com/artifact/org.springframework/spring-jdbc
    implementation("org.springframework:spring-jdbc:5.2.24.RELEASE")



    /* AOP AND TRANSACTIONS */
    // https://mvnrepository.com/artifact/org.aspectj/aspectjrt
    runtimeOnly("org.aspectj:aspectjrt:1.9.19")
    // https://mvnrepository.com/artifact/org.aspectj/aspectjtools
    implementation("org.aspectj:aspectjtools:1.9.19")
    // https://mvnrepository.com/artifact/org.springframework/spring-aop
    implementation("org.springframework:spring-aop:5.2.24.RELEASE")
    // https://mvnrepository.com/artifact/org.springframework/spring-tx
    implementation("org.springframework:spring-tx:5.2.24.RELEASE")

    /* CONVENIENCE (DATA TRANSFER/ANNOTATION GENERATE) */
    // https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core
    implementation("com.fasterxml.jackson.core:jackson-core:2.15.1")
    // https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind
    implementation("com.fasterxml.jackson.core:jackson-databind:2.15.1")
    // https://mvnrepository.com/artifact/org.projectlombok/lombok
    compileOnly("org.projectlombok:lombok:1.18.26")

    /* LOGGING */
    // https://mvnrepository.com/artifact/org.slf4j/slf4j-api
    implementation("org.slf4j:slf4j-api:1.7.36")
    // https://mvnrepository.com/artifact/org.slf4j/jcl-over-slf4j
    implementation("org.slf4j:jcl-over-slf4j:1.7.36")
    // https://mvnrepository.com/artifact/org.slf4j/slf4j-reload4j
    implementation("org.slf4j:slf4j-reload4j:1.7.36")

    /* SERVLET FOR LEGACY */
    // https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api
    implementation("javax.servlet:javax.servlet-api:4.0.1")

    /* TEST */
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // https://mvnrepository.com/artifact/org.springframework/spring-test
    testImplementation("org.springframework:spring-test:5.2.24.RELEASE")
}

tasks.test {
    useJUnitPlatform()
}