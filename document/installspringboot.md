# Install Springboot 

## Introduction 

SpringBoot is a part of Spring framework that uses Java. SpringBoot simplifies the process in creates a website and programmers just need to focus on developing the functions of an application. 

## Aim  
Install SpringBoot.Then, use visual studio code and command prompt to generate "Hello World" as final result through  ***http://localhost:8080/hello*** link. 

## Method : 

#### Step 1:
+ Download AdoptOpenJDK version 11. Then add path and create Java_Home in system variable.To test Java is running, open command prompt and run **java -version** and **javac -version**.

+ Then download Apache Maven. Add path and create NVM_HOME in system variable.To test Maven, open command prompt and run **nvm -version**. 

+ To use Maven on command prompt,open command prompt and  run **nvm install** 

![This is my image](image/image_1.jpg)

#### Step 2:
+ Install Visiual Studio package. If you already have visual studio code , only download recommend extensive pack for Java. 

1/ Language Support For Java by Red Hat 
2/ Debugger for Java 
3/ Test Runner for Java 
4/ Maven for Java 
5/ Project Manager for Java 
6/ Viusual Studio IntelliCode

#### Step 3: 

+ Download the following SpringBoot version :

![This is my image](image/image_2.jpg)

+ Download the zip, and unpack it into a folder on your computer.

#### Step 4:

+ Access the DemoApplication.java file through ***src/ main/com/example/demo***. Then , use the following code :

```java
package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
    public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
    }
                  
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
    return String.format("Hello %s!", name);
    }
                
}
```
#### Step 5:

+ Open terminal and cd to the demo file. Then, run mvnw spring-boot:run. The result will similar to below images: 

![This is my image](image/image_4.jpg)


+ Lastly, open website and use this link ***http://localhost:8080/hello*** to check your final result. 

![This is my image](image/image_3.jpg)
