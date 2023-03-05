package class24;

public abstract class phone {
    abstract void unlockphone();
    abstract void sendtext();
}
class iphone extends phone{
    @Override
    void unlockphone() {
        System.out.println("touch the screen");
    }

    @Override
    void sendtext() {
        System.out.println("go to the message");
    }
}
class samsung extends phone{
    @Override
    void unlockphone() {
        System.out.println("print the code");
    }

    @Override
    void sendtext() {
        System.out.println("go to the message");
    }
}