package Strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        DuckPager pager = new DuckPager();
        pager.setQuackBehavior(new Quack());
        pager.quackPager();
    }
}
