package id.web.qteen.contohoop;

public abstract class Mammal extends LivingThing implements Walker{
    @Override
    public void move() {
        walk();
    }

    @Override
    public void walk() {
        System.out.println("Mammal Walk!");
    }
}
