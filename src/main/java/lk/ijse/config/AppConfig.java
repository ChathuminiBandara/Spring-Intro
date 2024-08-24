package lk.ijse.config;


import lk.ijse.obj.BeanLifeCycle;
import lk.ijse.obj.MyObj;
import lk.ijse.obj.OtherObj;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

/*1st way -- spring wlata eligible wenna puluwn widiya 1*/


/*spring walata kiyanawa base package ekai sub pakages okkomai balanna kiyala*/
//@ComponentScan(basePackages = "lk.ijse")

/*spring walata balanna ona than tika witharai kiyanne*/
@ComponentScan(basePackageClasses = {MyObj.class ,BeanLifeCycle.class})

public class AppConfig {

    /*2nd way -- spring wlata eligible wenna puluwn widiya 2*/
    @Bean
    OtherObj otherObj(){
        /*spring wala ena dulaba moment ekak "new" keyword eka use krana*/
        return new OtherObj();
    }
}
