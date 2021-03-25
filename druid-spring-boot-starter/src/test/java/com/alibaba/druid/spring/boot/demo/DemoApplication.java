package com.alibaba.druid.spring.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lihengming<89921218@qq.com>
 *
 * <p>A simple demo</p>
 * <p>1. Configure application.properties as needed, please refer to config-template.properties for configuration items</p>
 * <p>2.run DemoApplication</p>
 * <p>3. Visit http://127.0.0.1:8080/druid</p>
 * <p>4. Visit the /user/${id} interface to view the SQL, Web, and AOP monitoring effects, such as: http://127.0.0.1:8080/user/1</p>
 *
 */
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
