package lk.ijse.app;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Logs {
    @After("execution(public  void  startTransaction())")  //method eka call wenna ona welwa
    public static void startTransLog(){
        System.out.println("Start log");
    }
    @After("execution(public  void endTransaction())") //me method eka invoke unata passe run wenna
    public static void endTranseLog(){
        System.out.println("End Log");
    }
}
