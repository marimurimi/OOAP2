public class TalkativeMonster extends Monster {

    @Override
    protected void name() {
        System.out.println("Я говорящий");
    }

    @Override
    protected void cook() {
        System.out.println("Я варю");
    }

    protected void talk() {
        System.out.println("Я говорю");
    }
}
