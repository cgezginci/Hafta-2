public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Ali",10,100,100, 40, 50 );
        Fighter f2 = new Fighter("Ahmet",20, 80, 85, 30, 50);

        Match match = new Match(f1, f2, 85, 100);
        match.run();
    }
}
