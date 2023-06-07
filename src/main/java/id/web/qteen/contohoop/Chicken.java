package id.web.qteen.contohoop;

public class Chicken extends Aves implements Walker, Jumper {
    @Override
    public void walk() {
        System.out.println("Chicken Walk!");
    }

    @Override
    public void jump() {
        System.out.println("Chicken can Jump!");
    }

    @Override
    public void move() {
        move(false);
    }

    public void move(boolean isJump) {
        if(isJump) jump();
        else walk();
    }
}
