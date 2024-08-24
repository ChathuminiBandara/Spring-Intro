package lk.ijse.config;


import lk.ijse.obj.MyObj;
import lk.ijse.obj.OtherObj;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

/*1st way*/


/*spring walata kiyanawa base package ekai sub pakages okkomai balanna kiyala*/
@ComponentScan(basePackages = "lk.ijse")

/*spring walata balanna ona than tika witharai kiyanne*/
//@ComponentScan(basePackageClasses = {MyObj.class})

public class AppConfig {

    /*2nd way*/
    @Bean
    OtherObj otherObj(){
        return new OtherObj();
    }
}
