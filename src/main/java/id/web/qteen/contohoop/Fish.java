package id.web.qteen.contohoop;

public abstract class Fish extends LivingThing implements Swimmer {

    @Override
    public void swim() {
        System.out.println("Fish Swim!");
    }

    @Override
    public void move() {
        swim();
    }
}
