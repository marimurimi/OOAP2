
public abstract class Monster {

    final  void monsterDay(){
        name();
        catchVictim();
        cook();
        eat();
        sleep();
        talk();
    }

    protected abstract void name();

    protected void sleep(){
        System.out.println("Я сплю");
    };

    protected void eat(){
        System.out.println("Я ем");
    };

    protected void catchVictim(){

        System.out.println("Я ловлю жертву");
    };

    protected abstract void cook();

    protected void talk(){

    };

}
