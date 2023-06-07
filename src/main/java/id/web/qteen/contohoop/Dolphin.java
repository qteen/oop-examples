package id.web.qteen.contohoop;

public class Dolphin extends Fish implements Jumper{
    @Override
    public void jump() {
        System.out.println("Dolphin can Jump!");
    }

    public void move(boolean isJump) {
        if(isJump) jump();
        else super.move();
    }
}
