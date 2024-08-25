package lk.ijse.User;

import jakarta.annotation.PostConstruct;
import lk.ijse.Contract.GoodBoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ian {
    @Autowired
    private GoodBoy goodBoy;

    public Ian() {
        System.out.println(goodBoy);
    }

    @PostConstruct
    public void init(){
        goodBoy.Good();
    }
}
