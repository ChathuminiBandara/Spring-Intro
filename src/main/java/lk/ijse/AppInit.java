package lk.ijse;

import lk.ijse.app.Transaction;
import lk.ijse.config.AppConfig;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppInit {
    public static void main(String[] args) {
        var ctx  = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
       /* var myobj = ctx.getBean("MyObj");
        System.out.println(myobj);
*/
        Transaction transaction = (Transaction) ctx.getBean("transaction");
        transaction.startTransaction();
        transaction.endTransaction();

 /*       ConfigurableBeanFactory beanFactory = ctx.getBeanFactory();
        System.out.println("Is Bean Singleton ? " + beanFactory.isSingleton("MyObj"));*/
        ctx.close();
        ctx.registerShutdownHook();
    }
}