package lk.ijse.config;


import lk.ijse.obj.MyObj;
import lk.ijse.obj.OtherObj;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

/*1st way*/
@ComponentScan(basePackageClasses = {MyObj.class})
/*@ComponentScan(basePackages = "lk.ijse")*/

public class AppConfig {

    /*2nd way*/
    @Bean
    OtherObj otherObj(){
        return new OtherObj();
    }
}
