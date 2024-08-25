package lk.ijse.Beans;

import lk.ijse.Contract.GoodBoy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier
public class Ian3 implements GoodBoy {

    @Override
    public void Good() {

    }
}
