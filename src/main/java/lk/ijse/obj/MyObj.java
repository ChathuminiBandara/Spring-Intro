package lk.ijse.obj;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("MyObj")

/*@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)*/
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MyObj {
    public MyObj(){
        System.out.println("Hello obj");
    }
}
