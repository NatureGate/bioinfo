package com.bmb.compute.bioinfo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bmb.compute.bioinfo.*.dao")
public class BioinfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BioinfoApplication.class, args);
    }

}
