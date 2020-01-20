import persistenceAdapter.Controller;
import persistenceAdapter.ViolationDAO;

import java.util.Date;

public class Start {
    public static void main(String[] args) {
        ViolationDAO v = new ViolationDAO();
        v.setDate(new Date());
        v.setLattitude(100L);
        v.setLongtitude(50L);
        v.setValue("value1");
        v.setViolationId(2L);

        Controller.sessionExample(v);
    }
}
