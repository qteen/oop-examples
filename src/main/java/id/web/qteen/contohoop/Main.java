package id.web.qteen.contohoop;

public class Main {
    public static void main(String[] args) {
        Chicken mychicken = new Chicken();
        Aves myeagle = new Eagle();
        Swimmer myshark = new Shark();
        LivingThing mycheetah = new Cheetah();
        Dolphin mydolphin = new Dolphin();
        // Mammal mymonkey = new Mammal();
        // Baris koding di atas error karena Mammal adalah class Abstract, semua class Abstract tidak bisa di inisialisasi jadi Object

        // Jumper myfrog = new Jumper();
        // Baris koding di atas error karena Jumper adalah Interface, semua Interface tidak bisa di inisialisasi jadi Object

        mycheetah.move();
        myeagle.move();
        mychicken.move();
        mychicken.move(true);
        // myshark.move();
        // baris koding di atas error karena interface Swimmer tidak memiliki method move
        myshark.swim();
        mydolphin.move();
        mydolphin.move(true);
    }
}
