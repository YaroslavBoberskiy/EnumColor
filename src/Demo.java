/**
 * Created by YB on 26.10.2015.
 */
public class Demo {

    public static void main(String[] args) {

        Car mercedes = new Car();
        mercedes.setCarName("Mercedes SLK");
        mercedes.setColor(Color.BLACK);
        mercedes.setCabrio(true);
        mercedes.setDoorsCount(2);
        mercedes.setEngineCC(4.2);
        mercedes.setMaxSpeed(270);

        mercedes.printInfo(mercedes);

        mercedes.move(mercedes);
        mercedes.turn(mercedes);
        mercedes.stop(mercedes);

    }

}
