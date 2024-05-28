package pog.highlandpan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("pog.highlandpan.mapper")
public class HighlandpanApplication {

    public static void main(String[] args) {
        SpringApplication.run(HighlandpanApplication.class, args);
    }

}
