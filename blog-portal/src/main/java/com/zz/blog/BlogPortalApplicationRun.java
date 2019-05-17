package com.zz.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BlogPortalApplicationRun extends SpringBootServletInitializer {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(BlogPortalApplicationRun.class, args);

    }
}
