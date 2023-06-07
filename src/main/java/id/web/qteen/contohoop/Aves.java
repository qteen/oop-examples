package id.web.qteen.contohoop;

public abstract class Aves extends LivingThing implements Flier {
    @Override
    public void fly() {
        System.out.println("Aves Fly!");
    }

    @Override
    public void move() {
        fly();
    }
}
