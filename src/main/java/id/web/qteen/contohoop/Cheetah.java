package id.web.qteen.contohoop;

public class Cheetah extends Mammal implements Runner {
    @Override
    public void run() {
        System.out.println("Cheetah Run!");
    }

    @Override
    public void move() {
        run();
    }
}
