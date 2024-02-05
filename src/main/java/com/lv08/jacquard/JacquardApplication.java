package com.lv08.jacquard;

import com.lv08.jacquard.util.Result;
import javax.management.OperationsException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class JacquardApplication {

  public static void main(String[] args) {
    SpringApplication.run(JacquardApplication.class, args);

  }

}
