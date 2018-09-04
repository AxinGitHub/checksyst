package cn.xx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "cn.xx")
public class TestApplications {

    public static void main(String[] args)  {
        System.out.println( "  启动项目  ");
        SpringApplication.run(TestApplications.class, args);
    }

}
