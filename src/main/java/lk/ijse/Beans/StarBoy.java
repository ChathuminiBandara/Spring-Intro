package lk.ijse.Beans;

import lk.ijse.Contract.GoodBoy;
import org.springframework.stereotype.Component;

@Component
public class StarBoy implements GoodBoy {
    @Override
    public void Good() {
        System.out.println("Ian Is a Good Boy");
    }
}
