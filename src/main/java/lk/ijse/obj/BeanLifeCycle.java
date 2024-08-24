package lk.ijse.obj;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("BeanLifeCycle")
public class BeanLifeCycle implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean, ApplicationContextAware {
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactory is" + beanFactory );
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanName is" + name );

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanLifeCycle afterPropertiesSet");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("BeanLifeCycle setApplicationContext");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("BeanLifeCycle destroy");

    }

    @PreDestroy
    public void getLost() {
        System.out.println("Lost The Bean");
    }

}
