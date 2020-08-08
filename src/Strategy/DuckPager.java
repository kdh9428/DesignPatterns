package Strategy;

public class DuckPager {

    QuackBehavior quackBehavior;

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void quackPager(){
        quackBehavior.quack();
    }
}
