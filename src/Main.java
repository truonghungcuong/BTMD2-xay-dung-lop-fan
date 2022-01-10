public class Main {
    public static void main(String[] args) {
        Fan fan1 =new Fan();
        System.out.println(fan1.getSpeed());
        System.out.println(fan1.getRadius());
        System.out.println(fan1.getColor());
        fan1.setSpeed(Fan.FAST);
        System.out.println(fan1.getSpeed());
    }
}
