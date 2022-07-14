public class IfElse {
    public static void main(String[] args) {
        int time = 23;
        if (time >= 6  && time <= 10) {
            System.out.println("Good morning.");
        } else if (time > 10 && time < 18) {
            System.out.println("Good day.");
        } else if (time >= 18 && time < 23) {
            System.out.println("Good evening.");
        } else {
            System.out.println("Good night.");
        }
    }
}
