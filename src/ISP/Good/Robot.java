package ISP.Good;

import ISP.Bad.Worker;

public class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Robot is working");
    }

}
