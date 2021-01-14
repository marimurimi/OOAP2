public class SilentMonster extends Monster {
    String day;

    public SilentMonster(String day) {
        this.day = day;
    }


    @Override
    protected void name() {
        System.out.println("Я молчун");
    }

    @Override
    protected void cook() {
        if(day == "Saturday" || day =="Sunday"){
            System.out.println("Я жарю");
        }
        else{
            System.out.println("Я варю");
        }


    }

}